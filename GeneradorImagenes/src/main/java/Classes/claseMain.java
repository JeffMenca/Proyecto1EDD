package Classes;

// Clase principal
import Forms.MenuForm;
import Objects.Usuario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import Classes.ArbolAVLUsuario;
import javax.swing.JOptionPane;

public class claseMain {
    
    //Listas y arboles principales
    public static ArbolAVLUsuario arbolAVL = new ArbolAVLUsuario();
    public static ArbolABBCapas arbolABB = new ArbolABBCapas();
    public static ListaDobleImagenes listaImagenes = new ListaDobleImagenes();

    public static void main(String[] args) {
        //Lllamada del form principal
        System.out.println("Inicio del programa");
        MenuForm menu = new MenuForm();
    }

    public static void guardarImagen(String texto, String absolutePath) {
        //Writer para leer el archivo 
        FileWriter writer = null;
        try {
            //Crea el archivo en la absolute path
            writer = new FileWriter(absolutePath, true);
            try (BufferedWriter out = new BufferedWriter(writer)) {
                out.write("");
                out.write(texto);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la imagen");
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar la imagen");
            }
        }
    }

}
