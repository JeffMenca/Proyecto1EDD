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

    public static ArbolAVLUsuario arbolAVL = new ArbolAVLUsuario();
    public static ArbolABBCapas arbolABB = new ArbolABBCapas();
    public static ListaDobleImagenes listaImagenes = new ListaDobleImagenes();

    public static void main(String[] args) {
        //Menu y systems
        System.out.println("Hola mundo");
        MenuForm menu = new MenuForm();
        //Creacion de usuarios
        Usuario user1 = new Usuario("a");
        Usuario user3 = new Usuario("c");
        //Creacion de capas
        MatrizDispersa matrizDispersa = new MatrizDispersa();
        MatrizDispersa matrizDispersa2 = new MatrizDispersa();
        //matrizDispersa.insertar(2, 2, "#000000");
        //matrizDispersa.insertar(3, 3, "#000000");
        //matrizDispersa2.insertar(4, 4, "#000000");
        //matrizDispersa2.insertar(4, 7, "#000000");
        //arbolABB.insertar("1", matrizDispersa);
        //arbolABB.insertar("2", matrizDispersa2);
        //Creacion de imagen
        Imagen nuevaImagen = new Imagen("111");
        nuevaImagen.insertarCapaCola("1");
        nuevaImagen.insertarCapaCola("2");
        try {
            nuevaImagen.generarImagen();
        } catch (Exception e) {
        }
        //Lista doble
        listaImagenes.insertarImagen(nuevaImagen);
        listaImagenes.ordenarLista();
        //listaImagenes.mostrarDatos();

    }

    public static void saveFile(String texto, String absolutePath) {
        FileWriter escritor = null;
        try {
            escritor = new FileWriter(absolutePath, true);
            BufferedWriter out = new BufferedWriter(escritor);
            out.write("");
            out.write(texto);
            out.close();
        } catch (IOException e) {
            System.out.println("Error al generar imagen");
        } finally {
            try {
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Error al generar imagen");
            }
        }
    }

}
