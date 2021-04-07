package Classes;

/**
 *
 * @author Jeffrey
 */
   public class NodoColaImagenes {
   
    private Imagen imagen;
    private NodoColaImagenes siguiente;

    public NodoColaImagenes(Imagen imagen, NodoColaImagenes siguiente) {
        this.imagen = imagen;
        this.siguiente = siguiente;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public NodoColaImagenes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoColaImagenes siguiente) {
        this.siguiente = siguiente;
    }   
}