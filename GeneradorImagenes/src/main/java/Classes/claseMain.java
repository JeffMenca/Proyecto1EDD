package Classes;

// Clase principal
import Forms.Menu;
import Classes.*;
import Objects.Usuario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class claseMain {

    public static ArbolAVLUsuario arbolAVL = new ArbolAVLUsuario();
    public static ArbolABBCapas arbolABB = new ArbolABBCapas();

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Menu menu = new Menu();
        //menu.setVisible(true);
        Usuario user1 = new Usuario("a");
        Usuario user3 = new Usuario("c");
        MatrizDispersa matrizDispersa = new MatrizDispersa();
        matrizDispersa.insertar(1, 1, "#000000");
        matrizDispersa.insertar(5, 5, "#000000");
        arbolABB.insertar("1", matrizDispersa);
        arbolABB.insertar("1", matrizDispersa);
        arbolABB.insertar("3", matrizDispersa);
        arbolABB.inOrden();
        arbolABB.eliminar("1");
        arbolABB.inOrden();
        try {
            matrizDispersa.graficarMatriz();
        } catch (Exception e) {
        }

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
            System.out.println("============== error escribiendo en archivo");
        } finally {
            try {
                escritor.close();
            } catch (IOException ex) {
                System.out.println("========no se pudo cerrar archivo");
            }
        }

    }

}
