package Classes;

import Objects.Usuario;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey
 */
public class ArbolABBCapas {

    private NodoABBCapas raiz;
    private ArrayList<NodoABBCapas> nodosLimitados = new ArrayList<>();
    private String graficaArbolCapas = "";
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
        System.out.println("{ ID: " + nodo.getId() + " }\n");
        inOrden(nodo.getRight());
    }

    private void obtenerGrafica(NodoABBCapas nodo) {
        if (null == nodo) {
            return;
        }
        obtenerGrafica(nodo.getLeft());
        try {
            graficaArbolCapas += "capa" + nodo.getId() + "->" + "capa" + nodo.getLeft().getId() + ";\n";
        } catch (Exception e) {
        }
        try {
            graficaArbolCapas += "capa" + nodo.getId() + "->" + "capa" + nodo.getRight().getId() + ";\n";
        } catch (Exception e) {
        }
        obtenerGrafica(nodo.getRight());
    }

    public String obtenerGrafica() {
        graficaArbolCapas = "";
        obtenerGrafica(this.raiz);
        return graficaArbolCapas;
    }

    private void preOrden(NodoABBCapas nodo) {
        if (null == nodo) {
            return;
        }
        System.out.println("{ ID: " + nodo.getId() + " }\n");
        preOrden(nodo.getLeft());
        preOrden(nodo.getRight());
    }

    private void postOrden(NodoABBCapas nodo) {
        if (null == nodo) {
            return;
        }
        postOrden(nodo.getLeft());
        postOrden(nodo.getRight());
        System.out.println("{ ID: " + nodo.getId() + " }\n");
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

    //Recorrido limitado
    private void inOrdenLimitado(NodoABBCapas nodo, int limitante) {
        if (null == nodo) {
            return;
        }
        
        inOrdenLimitado(nodo.getLeft(), limitante);
        if (nodosLimitados.size()==limitante) {
            return;
        }
        nodosLimitados.add(nodo);
        inOrdenLimitado(nodo.getRight(), limitante);
    }

    private void preOrdenLimitado(NodoABBCapas nodo, int limitante) {

        if (null == nodo) {
            return;
        }
        if (nodosLimitados.size()==limitante) {
            return;
        }
        nodosLimitados.add(nodo);
        preOrdenLimitado(nodo.getLeft(), limitante);
        preOrdenLimitado(nodo.getRight(), limitante);
    }

    private void postOrdenLimitado(NodoABBCapas nodo, int limitante) {
        if (null == nodo) {
            return;
        }
        if (limitante <= 0) {
            return;
        } else {
            limitante--;
        }
        postOrdenLimitado(nodo.getLeft(), limitante);
        postOrdenLimitado(nodo.getRight(), limitante);
        if (nodosLimitados.size()==limitante) {
            return;
        }
        nodosLimitados.add(nodo);
    }

    public ArrayList<NodoABBCapas> inOrdenLimitado(int limitante) {
        nodosLimitados = new ArrayList<>();
        inOrdenLimitado(this.raiz, limitante);
        return nodosLimitados;
    }

    public ArrayList<NodoABBCapas> preOrdenLimitado(int limitante) {
        nodosLimitados = new ArrayList<>();
        preOrdenLimitado(this.raiz, limitante);
        return nodosLimitados;
    }

    public ArrayList<NodoABBCapas> postOrdenLimitado(int limitante) {
        nodosLimitados = new ArrayList<>();
        postOrdenLimitado(this.raiz, limitante);
        return nodosLimitados;
    }

    public void graficarArbolCapas() throws IOException {
        String capas = obtenerGrafica();
        String salida = "digraph G {\n";
        salida += "subgraph cluster_0 {\n";
        salida += "style=filled;\n";
        salida += "color=lightgrey;\n";
        salida += "node [style=filled,color=white];\n";
        salida += capas;
        salida += "label = \" Arbol de Capas \";\n";
        salida += "}\n";
        salida += "}\n";

        File imagenSalida = new File("./arbolCapasGenerado.dot");
        if (!imagenSalida.exists()) {
            imagenSalida.createNewFile();
        } else {
            imagenSalida.delete();
            imagenSalida.createNewFile();
        }
        claseMain.guardarImagen(salida, imagenSalida.getAbsolutePath());
        String command = "dot -Tpng arbolCapasGenerado.dot -o arbolCapasGenerado.png";
        Runtime.getRuntime().exec(command);
    }

    public NodoABBCapas getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoABBCapas raiz) {
        this.raiz = raiz;
    }
    
    
}
