package Classes;

import Objects.Usuario;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey
 */
public class ArbolAVLUsuario {

    private NodoAVLUsuario raiz;
    public int size, seCreo = 1;
    private String graficaArbolUsuarios = "";

    public ArbolAVLUsuario() {
        this.raiz = null;
        size = 0;
    }

    public void eliminar(Usuario user) {
        NodoAVLUsuario nuevoUser = buscar(user.getUsuario());
        if (nuevoUser != null) {
            if (raiz == null) {
                raiz = null;
            } else {
                raiz = eliminarAVL(raiz, nuevoUser);
            }
            JOptionPane.showMessageDialog(null, "Se elimino exitosamente el usuario");
            size--;
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el usuario para eliminar");
        }

    }

    private NodoAVLUsuario eliminarAVL(NodoAVLUsuario nodo, NodoAVLUsuario nodoUser) {
        if (nodo == null) {
            return nodo;
        }
        if (nodoUser.getUsername().getUsuario().compareTo(nodo.getUsername().getUsuario()) < 0) {
            nodo.setLeft(eliminarAVL(nodo.left, nodoUser));
        } else if (nodoUser.getUsername().getUsuario().compareTo(nodo.getUsername().getUsuario()) > 0) {
            nodo.setRight(eliminarAVL(nodo.right, nodoUser));
        } else {

            if ((nodo.left == null) || (nodo.right == null)) {
                //Hijos
                NodoAVLUsuario aux = null;
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
                NodoAVLUsuario aux = getNodoMayor(nodo.left);
                nodo.getUsername().setUsuario(aux.getUsername().getUsuario());
                nodo.setLeft(eliminarAVL(nodo.left, aux));
            }
        }
        if (nodo == null) {
            return nodo;
        }
        //Actualiza la altura
        try {
            nodo.setHeight(Math.max(nodo.getLeft().getHeight(), nodo.right.getHeight()) + 1);
            int altura = nodo.getHeight();
            if ((altura > 1) && (nodo.left.getHeight() >= 0)) {
                return rotacionDerecha(nodo);
            }
            if ((altura < -1) && (nodo.right.getHeight() <= 0)) {
                return rotacionIzquierda(nodo);
            }
            if ((altura > 1) && (nodo.left.getHeight() < 0)) {
                nodo.setLeft(rotacionIzquierda(nodo.left));
                return rotacionDerecha(nodo);
            }
            if ((altura < -1) && (nodo.right.getHeight() > 0)) {
                nodo.setRight(rotacionDerecha(nodo.right));
                return rotacionIzquierda(nodo);
            }
        } catch (Exception e) {
        }

        return nodo;
    }

    private NodoAVLUsuario getNodoMayor(NodoAVLUsuario nodo) {
        NodoAVLUsuario nodoActual = nodo;
        while (nodo.getRight() != null) {
            nodoActual = nodoActual.getRight();
        }
        return nodoActual;
    }

    public NodoAVLUsuario buscar(String username) {
        Usuario user = new Usuario(username);
        return buscar(user, this.raiz);
    }

    private NodoAVLUsuario buscar(Usuario username, NodoAVLUsuario raiz) {
        if (raiz == null) {
            return null;
        }
        if (username.getUsuario().compareTo(raiz.getUsername().getUsuario()) == 0) {
            return raiz;
        }
        if (username.getUsuario().compareTo(raiz.getUsername().getUsuario()) > 0) {
            return buscar(username, raiz.getRight());
        }
        if (username.getUsuario().compareTo(raiz.getUsername().getUsuario()) < 0) {
            return buscar(username, raiz.getLeft());
        }
        return null;
    }

    public NodoAVLUsuario editar(Usuario username, String nuevoUsuario) {
        return editar(username, this.raiz, nuevoUsuario);
    }

    private NodoAVLUsuario editar(Usuario username, NodoAVLUsuario raiz, String nuevoUsuario) {
        if (raiz == null) {
            return null;
        }
        if (username.getUsuario().compareTo(raiz.getUsername().getUsuario()) == 0) {
            Usuario usuarioBuscar = new Usuario(nuevoUsuario);
            NodoAVLUsuario nuevoNodo = buscar(usuarioBuscar.getUsuario());
            if (nuevoNodo == null) {
                raiz.getUsername().setUsuario(nuevoUsuario);
                return raiz;
            } else {
                return null;
            }
        }
        if (username.getUsuario().compareTo(raiz.getUsername().getUsuario()) > 0) {
            return editar(username, raiz.getRight(), nuevoUsuario);
        }
        if (username.getUsuario().compareTo(raiz.getUsername().getUsuario()) < 0) {
            return editar(username, raiz.getLeft(), nuevoUsuario);
        }
        return null;
    }

    public int obtenerAltura(NodoAVLUsuario nodo) {
        if (nodo == null) {
            return -1;
        }
        return nodo.getHeight();
    }

    public NodoAVLUsuario rotacionIzquierda(NodoAVLUsuario nodo) {
        NodoAVLUsuario aux = nodo.getLeft();
        nodo.setLeft(aux.getRight());
        aux.setRight(nodo);
        nodo.setHeight(Math.max(nodo.getLeft().getHeight(), nodo.getRight().getHeight()) + 1);
        aux.setHeight(Math.max(nodo.getLeft().getHeight(), nodo.getRight().getHeight()) + 1);
        return aux;

    }

    public NodoAVLUsuario rotacionDerecha(NodoAVLUsuario nodo) {
        NodoAVLUsuario aux = nodo.getRight();
        nodo.setRight(aux.getLeft());
        aux.setLeft(nodo);
        nodo.setHeight(Math.max(nodo.getLeft().getHeight(), nodo.getRight().getHeight()) + 1);
        aux.setHeight(Math.max(nodo.getLeft().getHeight(), nodo.getRight().getHeight()) + 1);
        return aux;

    }

    public NodoAVLUsuario rotacionDobleIzquierda(NodoAVLUsuario nodo) {
        NodoAVLUsuario aux;
        nodo.setLeft(rotacionDerecha(nodo.getLeft()));
        aux = rotacionIzquierda(nodo);
        return aux;
    }

    public NodoAVLUsuario rotacionDobleDerecha(NodoAVLUsuario nodo) {
        NodoAVLUsuario aux;
        nodo.setRight(rotacionIzquierda(nodo.getRight()));
        aux = rotacionDerecha(nodo);
        return aux;
    }

    private NodoAVLUsuario insertarAVL(NodoAVLUsuario nodo, NodoAVLUsuario nodoAux) {
        NodoAVLUsuario nodoPadre = nodoAux;
        seCreo = 1;

        if (nodo.getUsername().getUsuario().compareTo(nodoAux.getUsername().getUsuario()) < 0) {

            if (nodoAux.getLeft() == null) {
                nodoAux.setLeft(nodo);
            } else {
                nodoAux.setLeft(insertarAVL(nodo, nodoAux.getLeft()));
                if (obtenerAltura(nodoAux.getLeft()) - obtenerAltura(nodoAux.getRight()) == 2) {
                    if (nodo.getUsername().getUsuario().compareTo(nodoAux.getLeft().getUsername().getUsuario()) == -1) {
                        nodoPadre = rotacionIzquierda(nodoAux);
                    } else {
                        nodoPadre = rotacionDerecha(nodoAux);
                    }
                }
            }
        } else if (nodo.getUsername().getUsuario().compareTo(nodoAux.getUsername().getUsuario()) > 0) {
            if (nodoAux.getRight() == null) {
                nodoAux.setRight(nodo);
            } else {
                nodoAux.setRight(insertarAVL(nodo, nodoAux.getRight()));
                if (obtenerAltura(nodoAux.getRight()) - obtenerAltura(nodoAux.getLeft()) == 2) {
                    if (nodo.getUsername().getUsuario().compareTo(nodoAux.getRight().getUsername().getUsuario()) == 1) {
                        nodoPadre = rotacionDerecha(nodoAux);
                    } else {
                        nodoPadre = rotacionIzquierda(nodoAux);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El username ya existe, ingrese otro");
            seCreo = 0;
        }
        if (nodoAux.getLeft() == null && nodoAux.getRight() != null) {
            nodoAux.setHeight(nodoAux.getRight().getHeight() + 1);
        } else if (nodoAux.getRight() == null && nodoAux.getLeft() != null) {
            nodoAux.setHeight(nodoAux.getLeft().getHeight() + 1);
        } else {
            nodoAux.setHeight(Math.max(obtenerAltura(nodoAux.getLeft()), obtenerAltura(nodoAux.getRight())) + 1);
        }
        return nodoPadre;
    }

    public void insertar(Usuario user) {
        NodoAVLUsuario nuevoUser = new NodoAVLUsuario(user, null, null, 1);
        if (raiz == null) {
            raiz = nuevoUser;
        } else {
            raiz = insertarAVL(nuevoUser, raiz);
        }
        size++;
        if (seCreo == 1) {
            JOptionPane.showMessageDialog(null, "El usuario se creo exitosamente");
        }
    }

    private NodoAVLUsuario insertarAVL2(NodoAVLUsuario nodo, NodoAVLUsuario nodoAux) {
        NodoAVLUsuario nodoPadre = nodoAux;
        seCreo = 1;

        if (nodo.getUsername().getUsuario().compareTo(nodoAux.getUsername().getUsuario()) < 0) {

            if (nodoAux.getLeft() == null) {
                nodoAux.setLeft(nodo);
            } else {
                nodoAux.setLeft(insertarAVL2(nodo, nodoAux.getLeft()));
                if (obtenerAltura(nodoAux.getLeft()) - obtenerAltura(nodoAux.getRight()) == 2) {
                    if (nodo.getUsername().getUsuario().compareTo(nodoAux.getLeft().getUsername().getUsuario()) == -1) {
                        nodoPadre = rotacionIzquierda(nodoAux);
                    } else {
                        nodoPadre = rotacionDerecha(nodoAux);
                    }
                }
            }
        } else if (nodo.getUsername().getUsuario().compareTo(nodoAux.getUsername().getUsuario()) > 0) {
            if (nodoAux.getRight() == null) {
                nodoAux.setRight(nodo);
            } else {
                nodoAux.setRight(insertarAVL2(nodo, nodoAux.getRight()));
                if (obtenerAltura(nodoAux.getRight()) - obtenerAltura(nodoAux.getLeft()) == 2) {
                    if (nodo.getUsername().getUsuario().compareTo(nodoAux.getRight().getUsername().getUsuario()) == 1) {
                        nodoPadre = rotacionDerecha(nodoAux);
                    } else {
                        nodoPadre = rotacionIzquierda(nodoAux);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El username ya existe, ingrese otro");
            seCreo = 0;
        }
        if (nodoAux.getLeft() == null && nodoAux.getRight() != null) {
            nodoAux.setHeight(nodoAux.getRight().getHeight() + 1);
        } else if (nodoAux.getRight() == null && nodoAux.getLeft() != null) {
            nodoAux.setHeight(nodoAux.getLeft().getHeight() + 1);
        } else {
            nodoAux.setHeight(Math.max(obtenerAltura(nodoAux.getLeft()), obtenerAltura(nodoAux.getRight())) + 1);
        }
        return nodoPadre;
    }

    public void insertar2(Usuario user) {
        NodoAVLUsuario nuevoUser = new NodoAVLUsuario(user, null, null, 1);
        if (raiz == null) {
            raiz = nuevoUser;
        } else {
            raiz = insertarAVL2(nuevoUser, raiz);
        }
        size++;
        if (seCreo == 1) {
        }
    }

    private void inOrden(NodoAVLUsuario nodo) {
        if (null == nodo) {
            return;
        }
        inOrden(nodo.getLeft());
        System.out.println("{ ID: " + nodo.getUsername().getUsuario() + " }\n");
        inOrden(nodo.getRight());
    }

    private void preOrden(NodoAVLUsuario nodo) {
        if (null == nodo) {
            return;
        }
        System.out.println("{ ID: " + nodo.getUsername().getUsuario() + " }\n");
        preOrden(nodo.getLeft());
        preOrden(nodo.getRight());
    }

    private void postOrden(NodoAVLUsuario nodo) {
        if (null == nodo) {
            return;
        }
        postOrden(nodo.getLeft());
        postOrden(nodo.getRight());
        System.out.println("{ ID: " + nodo.getUsername().getUsuario() + " }\n");
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

    private void obtenerGrafica(NodoAVLUsuario nodo) {
        if (null == nodo) {
            return;
        }
        obtenerGrafica(nodo.getLeft());
        try {
            graficaArbolUsuarios += nodo.getUsername().getUsuario() + "->" + nodo.getLeft().getUsername().getUsuario() + ";\n";
        } catch (Exception e) {
        }
        try {
            graficaArbolUsuarios += nodo.getUsername().getUsuario() + "->" + nodo.getRight().getUsername().getUsuario() + ";\n";
        } catch (Exception e) {
        }
        obtenerGrafica(nodo.getRight());
    }

    public String obtenerGrafica() {
        graficaArbolUsuarios = "";
        obtenerGrafica(this.raiz);
        return graficaArbolUsuarios;
    }

    public void graficarArbolUsuarios() throws IOException {
        String usuarios = obtenerGrafica();
        String salida = "digraph G {\n";
        salida += "subgraph cluster_0 {\n";
        salida += "style=filled;\n";
        salida += "color=lightgrey;\n";
        salida += "node [style=filled,color=white];\n";
        salida += usuarios;
        salida += "label = \" Arbol de Usuarios \";\n";
        salida += "}\n";
        salida += "}\n";

        File imagenSalida = new File("./arbolUsuariosGenerado.dot");
        if (!imagenSalida.exists()) {
            imagenSalida.createNewFile();
        } else {
            imagenSalida.delete();
            imagenSalida.createNewFile();
        }
        claseMain.guardarImagen(salida, imagenSalida.getAbsolutePath());
        String command = "dot -Tpng arbolUsuariosGenerado.dot -o arbolUsuariosGenerado.png";
        Runtime.getRuntime().exec(command);
    }
}
