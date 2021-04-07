
package Classes;

/**
 *
 * @author Jeffrey
 */
public class NodoListaDoble {
    private Imagen imagen;
    private NodoListaDoble siguiente;
    private NodoListaDoble anterior;

    public NodoListaDoble(Imagen imagen) {
        this.imagen = imagen;
        this.siguiente=null;
        this.anterior=null;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public NodoListaDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDoble anterior) {
        this.anterior = anterior;
    }
    
}
