package Classes;

/**
 *
 * @author Jeffrey
 */

public class NodoABBCapas {

    private MatrizDispersa capa;
    NodoABBCapas left;
    NodoABBCapas right;
    private String id;

    public NodoABBCapas(MatrizDispersa capa, MatrizDispersa left, MatrizDispersa right,String id) {
        this.capa = capa;
        this.left = null;
        this.right = null;
        this.id=id;
        this.capa.setId(id);
    }
    

    public MatrizDispersa getCapa() {
        return capa;
    }

    public void setCapa(MatrizDispersa capa) {
        this.capa = capa;
    }

    public NodoABBCapas getLeft() {
        return left;
    }

    public void setLeft(NodoABBCapas left) {
        this.left = left;
    }

    public NodoABBCapas getRight() {
        return right;
    }

    public void setRight(NodoABBCapas right) {
        this.right = right;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
