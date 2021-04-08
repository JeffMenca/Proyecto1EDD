package Classes;

import java.io.IOException;

/**
 *
 * @author Jeffrey
 */
public class Imagen {

    private String id;
    private ColaCapas capas;
    private MatrizDispersa imagen;

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

}
