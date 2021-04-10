package Classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey
 */
public class ColaImagenes {

    private NodoColaImagenes raiz, fondo;
    private int size = 0;

    public ColaImagenes() {
        raiz = null;
        fondo = null;
    }

    boolean vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertar(Imagen imagen) {

        if (imagen != null) {
            NodoColaImagenes nuevo = new NodoColaImagenes(imagen, raiz);
            if (vacia()) {
                raiz = nuevo;
                fondo = nuevo;
            } else {
                fondo.setSiguiente(nuevo);
                fondo = nuevo;
            }
            size++;
        } else {
            JOptionPane.showMessageDialog(null, "No existe ninguna imagen con ese id");
        }
    }

    public Imagen extraer() {
        if (!vacia()) {
            Imagen informacion = raiz.getImagen();
            if (raiz == fondo) {
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.getSiguiente();
            }

            return informacion;
        } else {
            return null;
        }
    }

    public void imprimir() {
        NodoColaImagenes imagen = raiz;
        while (imagen != null) {
            System.out.print(imagen.getImagen().getId() + "-");
            imagen = imagen.getSiguiente();
        }
        System.out.println();
    }

    public ArrayList<String> obtenerImagenes() {
        ArrayList<String> lista = new ArrayList<>();
        NodoColaImagenes imagen = raiz;
        while (imagen != null) {
            lista.add(imagen.getImagen().getId());
            imagen = imagen.getSiguiente();
            if (imagen == fondo) {
                lista.add(imagen.getImagen().getId());
                break;
            }
        }
        return lista;
    }

    public void eliminar(String id) {
        NodoColaImagenes imagen = raiz;
        while (imagen != null) {
            if (imagen.getSiguiente().getImagen().getId().equals(id)) {
                imagen.setSiguiente(imagen.getSiguiente().getSiguiente());
                size--;
            } else {
                imagen = imagen.getSiguiente();
                if (imagen == fondo) {
                    break;
                }
            }

        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
