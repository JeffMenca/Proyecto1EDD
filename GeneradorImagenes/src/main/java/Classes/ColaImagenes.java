package Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey
 */
public class ColaImagenes {

    private NodoColaImagenes raiz, fondo;

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

    void insertar(Imagen imagen) {

        if (imagen != null) {
            NodoColaImagenes nuevo = new NodoColaImagenes(imagen, raiz);
            if (vacia()) {
                raiz = nuevo;
                fondo = nuevo;
            } else {
                fondo.setSiguiente(nuevo);
                fondo = nuevo;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe ninguna imagen con ese id");
        }
    }

    Imagen extraer() {
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

}
