package Classes;

import Objects.Usuario;

/**
 *
 * @author Jeffrey
 */
public class NodoAVLUsuario {

    private Usuario username;
    NodoAVLUsuario left;
    NodoAVLUsuario right;
    private int height;

    public NodoAVLUsuario(Usuario username, NodoAVLUsuario left, NodoAVLUsuario right, int height) {
        this.username = username;
        this.left = null;
        this.right = null;
        this.height = 1;
    }

    public Usuario getUsername() {
        return username;
    }

    public void setUsername(Usuario username) {
        this.username = username;
    }

    public NodoAVLUsuario getLeft() {
        return left;
    }

    public void setLeft(NodoAVLUsuario left) {
        this.left = left;
    }

    public NodoAVLUsuario getRight() {
        return right;
    }

    public void setRight(NodoAVLUsuario right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
}


