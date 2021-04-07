package Classes;

import Objects.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey
 */
public class ArbolABBCapas {

    private NodoABBCapas raiz;
    public int size;

    public ArbolABBCapas() {
        this.raiz = null;
        size = 0;
    }

    public void eliminar(String id) {
        NodoABBCapas nuevoUser = buscar(id);
        if (nuevoUser != null) {
            if (raiz == null) {
                raiz = null;
            } else {
                raiz = eliminarAVL(raiz, nuevoUser);
            }
            JOptionPane.showMessageDialog(null, "Se elimino exitosamente la capa");
            size--;
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro la capa para eliminar");
        }
    }

    private NodoABBCapas eliminarAVL(NodoABBCapas nodo, NodoABBCapas nodoCapa) {
        if (nodo == null) {
            return nodo;
        }
        if (nodoCapa.getId().compareTo(nodo.getId()) < 0) {
            nodo.setLeft(eliminarAVL(nodo.getLeft(), nodoCapa));
        } else if (nodoCapa.getId().compareTo(nodo.getId()) > 0) {
            nodo.setRight(eliminarAVL(nodo.right, nodoCapa));
        } else {

            if ((nodo.left == null) || (nodo.right == null)) {
                //Hijos
                NodoABBCapas aux = null;
                if (aux == nodo.getLeft()) {
                    aux = nodo.getRight();
                } else {
                    aux = nodo.getLeft();
                }
                //No hijos
                if (aux == null) {
                    nodo = null;
                } else {
                    nodo = aux;
                }
            } else {
                NodoABBCapas aux = getNodoMayor(nodo.left);
                nodo.setId(aux.getId());
                nodo.setLeft(eliminarAVL(nodo.left, aux));
            }
        }
        return nodo;
    }

    private NodoABBCapas getNodoMayor(NodoABBCapas nodo) {
        NodoABBCapas nodoActual = nodo;
        while (nodo.getRight() != null) {
            nodoActual = nodoActual.getRight();
        }
        return nodoActual;
    }

    public NodoABBCapas buscar(String id) {
        return buscar(id, this.raiz);
    }

    private NodoABBCapas buscar(String id, NodoABBCapas raiz) {
        if (raiz == null) {
            return null;
        }
        if (id.compareTo(raiz.getId()) == 0) {
            return raiz;
        }
        if (id.compareTo(raiz.getId()) > 0) {
            return buscar(id, raiz.getRight());
        }
        if (id.compareTo(raiz.getId()) < 0) {
            return buscar(id, raiz.getLeft());
        }
        return null;
    }

    private NodoABBCapas insertarABB(NodoABBCapas nodo, NodoABBCapas nodoAux) {
        
        NodoABBCapas nodoPadre = nodoAux;
        if (nodo.getId().compareTo(nodoAux.getId()) < 0) {

            if (nodoAux.getLeft() == null) {
                nodoAux.setLeft(nodo);
            } else {
                nodoAux.setLeft(insertarABB(nodo, nodoAux.getLeft()));
            }
        } else if (nodo.getId().compareTo(nodoAux.getId()) > 0) {
            if (nodoAux.getRight() == null) {
                nodoAux.setRight(nodo);
            } else {
                nodoAux.setRight(insertarABB(nodo, nodoAux.getRight()));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ya existe una capa con ese nombre");
        }
        return nodoPadre;
    }

    public void insertar(String id, MatrizDispersa capa) {
        NodoABBCapas nuevaCapa = new NodoABBCapas(capa, null, null, id);
        if (raiz == null) {
            raiz = nuevaCapa;
        } else {
            raiz = insertarABB(nuevaCapa, raiz);
        }
        size++;
    }

    private void inOrden(NodoABBCapas nodo) {
        if (null == nodo) {
            return;
        }
        inOrden(nodo.getLeft());
        System.out.println("{ Llave: " + nodo.getId() + " }\n");
        inOrden(nodo.getRight());
    }

    private void preOrden(NodoABBCapas nodo) {
        if (null == nodo) {
            return;
        }
        System.out.println("{ Llave: " + nodo.getId() + " }\n");
        preOrden(nodo.getLeft());
        preOrden(nodo.getRight());
    }

    private void postOrden(NodoABBCapas nodo) {
        if (null == nodo) {
            return;
        }
        postOrden(nodo.getLeft());
        postOrden(nodo.getRight());
        System.out.println("{ Llave: " + nodo.getId() + " }\n");
    }

    public void inOrden() {
        inOrden(this.raiz);
    }

    public void preOrden() {
        preOrden(this.raiz);
    }

    public void postOrden() {
        postOrden(this.raiz);
    }
}
