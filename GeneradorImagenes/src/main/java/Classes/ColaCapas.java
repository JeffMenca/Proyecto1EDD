package Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey
 */
public class ColaCapas {

    private NodoColaCapas raiz, fondo;
    private int size = 0;

    ColaCapas() {
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

    void insertar(String id) {

        NodoABBCapas capaArbol = claseMain.arbolABB.buscar(id);
        if (capaArbol != null) {
            MatrizDispersa capa = capaArbol.getCapa();
            NodoColaCapas nuevo = new NodoColaCapas(capa, null);
            if (vacia()) {
                raiz = nuevo;
                fondo = nuevo;
            } else {
                fondo.setSiguiente(nuevo);
                fondo = nuevo;
            }
            size++;
        } else {
            JOptionPane.showMessageDialog(null, "No existe ninguna capa con ese id");
        }

    }

    MatrizDispersa extraer() {
        if (!vacia()) {
            MatrizDispersa informacion = raiz.getCapa();
            if (raiz == fondo) {
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.getSiguiente();
            }
            size--;
            return informacion;
        } else {
            return null;
        }
    }

    public void imprimir() {
        NodoColaCapas capa = raiz;
        while (capa != null) {
            System.out.print(capa.getCapa() + "-");
            try {
                capa.getCapa().graficarMatriz();
            } catch (Exception e) {
            }

            capa = capa.getSiguiente();
        }
        System.out.println();
    }

    public NodoColaCapas getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoColaCapas raiz) {
        this.raiz = raiz;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    

}
