package Classes;

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
            System.out.println("Ya existe una imagen con ese id");
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
        return null;
    }

    public void eliminarImagen(String id) {
        if (raiz != null) {
            NodoListaDoble nodo = buscarImagen(id);
            NodoListaDoble nodoAnterior = nodo.getAnterior();
            NodoListaDoble nodoSiguiente = nodo.getSiguiente();
            nodoAnterior.setSiguiente(nodoSiguiente);
            nodoSiguiente.setAnterior(nodoAnterior);
            JOptionPane.showMessageDialog(null, "Se ha eliminado imagen correctamente.");
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
}
