package Classes;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey
 */
public class ListaDobleImagenes {

    private NodoListaDoble raiz;
    private NodoListaDoble fondo;

    public ListaDobleImagenes() {
        raiz = null;
        fondo = null;
    }

    public void insertarImagen(Imagen imagen) {
        NodoListaDoble nuevoNodo = new NodoListaDoble(imagen);
        if (raiz == null) {
            raiz = nuevoNodo;
            fondo = nuevoNodo;
            raiz.setSiguiente(raiz);
            raiz.setAnterior(fondo);
        } else if (nodoNoExiste(nuevoNodo.getImagen().getId())) {
            fondo.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(raiz);
            nuevoNodo.setAnterior(fondo);
            fondo = nuevoNodo;
            raiz.setAnterior(fondo);
        } else {
            JOptionPane.showMessageDialog(null, "Ya existe una imagen con ese id");
        }
    }

    public boolean nodoNoExiste(String id) {
        NodoListaDoble aux = raiz;
        do {
            if (aux.getImagen().getId().equals(id)) {
                return false;
            }
            aux = aux.getSiguiente();

        } while (aux != raiz);

        return true;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Entro");
        NodoListaDoble aux = raiz;
        do {
            System.out.print("Nodo: " + aux.getImagen().getId());
            if (aux.getSiguiente() != null) {
                System.out.print(" Siguiente: " + aux.getSiguiente().getImagen().getId());
            }
            if (aux.getAnterior() != null) {
                System.out.print(" Anterior: " + aux.getAnterior().getImagen().getId());
            }
            aux = aux.getSiguiente();
        } while (aux != raiz);
    }

    public NodoListaDoble buscarImagen(String id) {
        if (raiz != null) {
            NodoListaDoble aux = raiz;
            do {
                if (aux.getImagen().getId().equals(id)) {
                    return aux;
                } else {
                    aux = aux.getSiguiente();
                }
            } while (aux != raiz);
        }
        JOptionPane.showMessageDialog(null, "No se encontro una imagen con ese id");
        return null;
    }

    public void eliminarImagen(String id) {
        if (raiz != null) {

            if (raiz == fondo) {
                raiz = fondo = null;
            } else if (id == raiz.getImagen().getId()) {
                raiz = raiz.getSiguiente();
            } else if (id == fondo.getImagen().getId()) {
                fondo = fondo.getAnterior();
            }
            NodoListaDoble nodo = buscarImagen(id);
            NodoListaDoble nodoAnterior = nodo.getAnterior();
            NodoListaDoble nodoSiguiente = nodo.getSiguiente();
            nodoAnterior.setSiguiente(nodoSiguiente);
            nodoSiguiente.setAnterior(nodoAnterior);
            JOptionPane.showMessageDialog(null, "Se ha eliminado la imagen correctamente");
        }
    }

    public void ordenarLista() {
        int size = getSize();
        if (size > 1) {
            for (int i = 0; i < getSize(); i++) {
                NodoListaDoble actual = raiz;
                NodoListaDoble siguiente = actual.getSiguiente();
                for (int j = 1; j < getSize(); j++) {
                    if (actual.getImagen().getId().compareTo(siguiente.getImagen().getId()) > 0) {
                        Imagen imagenAux = actual.getImagen();
                        actual.setImagen(siguiente.getImagen());
                        siguiente.setImagen(imagenAux);
                        actual = actual.getSiguiente();
                        siguiente = siguiente.getSiguiente();
                    } else {
                        actual = actual.getSiguiente();
                        siguiente = siguiente.getSiguiente();
                    }
                }
            }
        }
    }

    public int getSize() {
        NodoListaDoble aux = raiz;
        int size = 0;
        do {
            size++;
            aux = aux.getSiguiente();
        } while (aux != raiz);
        return size;
    }

    public void graficarListaImagenes() throws IOException {
        String salida = "digraph G{\n";
        salida += "style=filled;\n";
        salida += "label = \" Lista de imagenes \";\n";
        salida += "subgraph Lista { node [shape = square,height=.1]; label=\"Lista doble circular\"; \n";
        NodoListaDoble aux = raiz;
        for (int i = 0; i < getSize(); i++) {

            salida += aux.getImagen().getId() + "->" + aux.getSiguiente().getImagen().getId() + " [constraint=false]; \n";
            salida += aux.getSiguiente().getImagen().getId() + "->" + aux.getSiguiente().getAnterior().getImagen().getId() + "[constraint=false]; \n";
            aux = aux.getSiguiente();
        }
        salida = salida + "}";
        aux = raiz;
        for (int i = 0; i < getSize(); i++) {
            Imagen imagen = aux.getImagen();
            ColaCapas cola = imagen.getCapas();
            salida += "subgraph cluster_" + i + "{node [shape = square,height=.1]; rankdir=LR; label=\"Cola" + i + "\";  \n";
            NodoColaCapas nodoCola = cola.getRaiz();
            for (int j = 0; j < cola.getSize(); j++) {
                salida += "Cola" + i + "_" + "Capa" + nodoCola.getCapa().getId();
                if (nodoCola.getSiguiente() != null) {
                    salida += "->" + "Cola" + i + "_" + "Capa" + nodoCola.getSiguiente().getCapa().getId() + "; \n";
                    nodoCola = nodoCola.getSiguiente();
                }
                if (j + 2 == cola.getSize()) {
                    break;
                }
            }
            salida += " } \n";
            nodoCola = cola.getRaiz();
            salida += aux.getImagen().getId() + "->" + "Cola" + i + "_" + "Capa" + nodoCola.getCapa().getId() + "[lhead = cluster_" + i + "]; \n";
            aux = aux.getSiguiente();
        }
        salida += "}";
        File imagenSalida = new File("./listaImagenesGenerada.dot");
        if (!imagenSalida.exists()) {
            imagenSalida.createNewFile();
        } else {
            imagenSalida.delete();
            imagenSalida.createNewFile();
        }
        claseMain.guardarImagen(salida, imagenSalida.getAbsolutePath());
        String command = "dot -Tpng listaImagenesGenerada.dot -o listaImagenesGenerada.png";
        Runtime.getRuntime().exec(command);
    }

}
