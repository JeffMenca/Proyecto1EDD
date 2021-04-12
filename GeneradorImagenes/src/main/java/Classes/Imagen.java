package Classes;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Jeffrey
 */
public class Imagen {

    private String id;
    private ColaCapas capas;
    private MatrizDispersa imagen;
    private String graficaArbolCapas = "";

    public Imagen(String id) {
        this.id = id;
        capas = new ColaCapas();
        imagen = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ColaCapas getCapas() {
        return capas;
    }

    public void setCapas(ColaCapas capas) {
        this.capas = capas;
    }

    public void insertarCapaCola(String id) {
        capas.insertar(id);
    }

    public MatrizDispersa unirCapas() {
        MatrizDispersa imagenFinal = new MatrizDispersa();
        if (capas.vacia()) {
            return null;
        }
        MatrizDispersa capa = capas.extraer();
        while (capa != null) {
            int filas = capa.totalFilas;
            int columnas = capa.totalColumnas;
            for (int y = 1; y <= filas; y++) {
                for (int x = 1; x <= columnas; x++) {
                    NodoMatrizDispersa nodo = capa.graficarEnMatriz(x, y);
                    if (nodo != null) {
                        imagenFinal.insertar(nodo.getY(), nodo.getX(), nodo.getColor());
                    }
                }
            }
            capa = capas.extraer();
        }
        return imagenFinal;
    }

    public void generarImagen() throws IOException {
        imagen = unirCapas();
        imagen.graficarMatriz();
    }

    private void obtenerGrafica(NodoABBCapas nodo) {
        if (null == nodo) {
            return;
        }
        obtenerGrafica(nodo.getLeft());
        try {
            graficaArbolCapas += nodo.getId() + "->" + nodo.getLeft().getId() + ";\n";
        } catch (Exception e) {
        }
        try {
            graficaArbolCapas += nodo.getId() + "->" + nodo.getRight().getId() + ";\n";
        } catch (Exception e) {
        }
        obtenerGrafica(nodo.getRight());
    }

    public String obtenerGrafica() {
        graficaArbolCapas = "";
        obtenerGrafica(claseMain.arbolABB.getRaiz());
        return graficaArbolCapas;
    }

    public void graficarImagenArbolCapas(String id) throws IOException {
        String capastexto = null;
        capastexto = obtenerGrafica();
        NodoListaDoble nodo = claseMain.listaImagenes.buscarImagen(id);
        if (nodo != null) {
            Imagen imagen = nodo.getImagen();
            ColaCapas cola = imagen.getCapas();
            String salida = "digraph G {\n";
            salida += "subgraph cluster_1 {\n";
            salida += capastexto;
            salida += "label = \" Arbol de Capas \";\n";
            salida += "}\n";
            salida += "subgraph cluster_0 {\n";
            NodoColaCapas nodoCola = cola.getRaiz();
            for (int j = 0; j < cola.getSize(); j++) {
                salida += "Capa" + nodoCola.getCapa().getId();
                if (nodoCola.getSiguiente() != null) {
                    salida += "->" + "Capa" + nodoCola.getSiguiente().getCapa().getId() + "; \n";
                    if (claseMain.arbolABB.buscar(nodoCola.getCapa().getId()) != null) {
                        salida += "Capa" + nodoCola.getCapa().getId() + "->" + nodoCola.getCapa().getId() + "[lhead = cluster_1]; \n";
                    }
                    if (claseMain.arbolABB.buscar(nodoCola.getSiguiente().getCapa().getId()) != null && j + 2 == cola.getSize()) {
                        salida += "Capa" + nodoCola.getSiguiente().getCapa().getId() + "->" + nodoCola.getSiguiente().getCapa().getId() + "[lhead = cluster_1]; \n";
                    }
                    nodoCola = nodoCola.getSiguiente();
                }
                if (j + 2 == cola.getSize()) {
                    break;
                }

            }
            salida += "label = \" Capas Imagen \";\n";
            salida += "}\n";
            nodoCola = cola.getRaiz();
            salida += "Imagen" + nodo.getImagen().getId() + "->" + "Capa" + nodoCola.getCapa().getId() + "[lhead = cluster_0]; \n";
            salida += "}\n";
            File imagenSalida = new File("./imagenYArbolGenerado.dot");
            if (!imagenSalida.exists()) {
                imagenSalida.createNewFile();
            } else {
                imagenSalida.delete();
                imagenSalida.createNewFile();
            }
            claseMain.guardarImagen(salida, imagenSalida.getAbsolutePath());
            String command = "dot -Tpng imagenYArbolGenerado.dot -o imagenYArbolGenerado.png";
            Runtime.getRuntime().exec(command);
        }

    }

}
