package Classes;

/**
 *
 * @author Jeffrey
 */
   public class NodoColaCapas {
   
    private MatrizDispersa capa;
    private NodoColaCapas siguiente;

    public NodoColaCapas(MatrizDispersa capa, NodoColaCapas siguiente) {
        this.capa = capa;
        this.siguiente = siguiente;
    }

    public MatrizDispersa getCapa() {
        return capa;
    }

    public void setCapa(MatrizDispersa capa) {
        this.capa = capa;
    }

    public NodoColaCapas getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoColaCapas siguiente) {
        this.siguiente = siguiente;
    }   
}