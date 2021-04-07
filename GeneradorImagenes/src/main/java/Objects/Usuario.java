package Objects;

import Classes.*;

/**
 *
 * @author Jeffrey
 */
public class Usuario {

    private String usuario;
    private ColaImagenes imagenes;

    public Usuario(String usuario) {
        this.usuario = usuario;
        imagenes=new ColaImagenes();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public ColaImagenes getImagenes() {
        return imagenes;
    }

    public void setImagenes(ColaImagenes imagenes) {
        this.imagenes = imagenes;
    }
    
    

}
