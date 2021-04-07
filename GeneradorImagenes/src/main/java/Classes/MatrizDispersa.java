package Classes;

import Classes.NodoMatrizDispersa;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Jeffrey
 */

public class MatrizDispersa {

  
    public int totalFilas;
    public int totalColumnas;
    private NodoMatrizDispersa raiz;
    
    public MatrizDispersa() {
        raiz = new NodoMatrizDispersa(0,0,null);
    }
    
    public NodoMatrizDispersa insertarFila(int fila) {
        NodoMatrizDispersa cabezaNodoNodo = raiz.getFilaSiguiente();
        NodoMatrizDispersa nuevoNodoNodo = new NodoMatrizDispersa(0,fila,null);
        if(cabezaNodoNodo == null) {
            raiz.setFilaSiguiente(nuevoNodoNodo);
            nuevoNodoNodo.setColumnaAnterior(raiz);
        } else {
            if(cabezaNodoNodo.getY() > fila) {
                nuevoNodoNodo.setFilaSiguiente(cabezaNodoNodo);
                cabezaNodoNodo.setFilaAnterior(nuevoNodoNodo);
                raiz.setFilaSiguiente(nuevoNodoNodo);
                nuevoNodoNodo.setFilaAnterior(raiz);
            } else {
                NodoMatrizDispersa aux = cabezaNodoNodo;
                while(aux.getFilaSiguiente() != null) {
                    if(aux.getFilaSiguiente().getY() < fila) {
                        nuevoNodoNodo.setFilaSiguiente(aux.getFilaSiguiente());
                        aux.getFilaSiguiente().setFilaAnterior(nuevoNodoNodo);
                        nuevoNodoNodo.setFilaAnterior(aux);
                        aux.setFilaSiguiente(nuevoNodoNodo);
                        totalFilas++;
                        return nuevoNodoNodo;
                    }
                    aux = aux.getFilaSiguiente();
                }
                aux.setFilaSiguiente(nuevoNodoNodo);
                nuevoNodoNodo.setFilaAnterior(aux);
            }
        }
        
        if(fila > totalFilas) {
            totalFilas = fila;
        }
        return nuevoNodoNodo;
    }
    
    public NodoMatrizDispersa insertarColumna(int columna) {
        NodoMatrizDispersa cabezaNodo = raiz.getColumnaSiguiente();
        NodoMatrizDispersa nuevoNodo = new NodoMatrizDispersa(columna,0,null);
        if(cabezaNodo == null) {
            raiz.setColumnaSiguiente(nuevoNodo);
            nuevoNodo.setColumnaAnterior(raiz); 
        } else {
            if(cabezaNodo.getX() > columna) {
                nuevoNodo.setColumnaSiguiente(cabezaNodo);
                cabezaNodo.setColumnaAnterior(nuevoNodo);
                raiz.setColumnaSiguiente(nuevoNodo);
                nuevoNodo.setColumnaAnterior(raiz);
            } else {
                NodoMatrizDispersa aux = cabezaNodo;
                while(aux.getColumnaSiguiente() != null) {
                    if(aux.getColumnaSiguiente().getX() < columna) {
                        nuevoNodo.setColumnaSiguiente(aux.getColumnaSiguiente());
                        aux.getColumnaSiguiente().setColumnaAnterior(nuevoNodo);
                        nuevoNodo.setColumnaAnterior(aux);
                        aux.setColumnaSiguiente(nuevoNodo);
                        totalColumnas++;
                        return nuevoNodo;
                    }
                    aux = aux.getColumnaSiguiente();
                }
                aux.setColumnaSiguiente(nuevoNodo);
                nuevoNodo.setColumnaAnterior(aux);
            }
        }
        if(columna > totalColumnas) {
            totalColumnas = columna;
        }
        return nuevoNodo;
    }
    
    
    public NodoMatrizDispersa obtenerFila(int fila,boolean flag) {
        NodoMatrizDispersa aux = raiz.getFilaSiguiente();
        while(aux != null) {
            if(aux.getY() == fila){
                return aux;
            }
            aux = aux.getFilaSiguiente();
        }
        if(flag)
            return insertarFila(fila);
        return null;
    }
    
    public NodoMatrizDispersa obtenerColumna(int columna,boolean flag) {
        NodoMatrizDispersa aux = raiz.getColumnaSiguiente();
        while(aux != null) {
            if(aux.getX() == columna){
                return aux;
            }
            aux = aux.getColumnaSiguiente();
        }
        if(flag)
            return insertarColumna(columna);
        return null;
    }
    
    public NodoMatrizDispersa triangular(int columna,int fila) {
        NodoMatrizDispersa nodoColumna = obtenerColumna(columna,false);
        if(nodoColumna != null){
            NodoMatrizDispersa aux = nodoColumna;
            while(aux != null) {
                if(aux.getY() == fila) {
                    return aux;
                }
                aux = aux.getFilaSiguiente();
            }
            return null;
        } else {
            return null;
        }
    }
    
    public void insertar(int columna, int fila,String color) {
        NodoMatrizDispersa nuevoNodo = new NodoMatrizDispersa(columna,fila,color);
        if(color.equals("#ffffff") || color.equals("#FFFFFF") || color.equals("#fFfFfF") || color.equals("#FfFfFf")){}else{
        this.insertar(nuevoNodo);}
    }
    
    private void insertar(NodoMatrizDispersa nodo) {
        NodoMatrizDispersa nuevoNodo = nodo;
        int fila = nodo.getY();
        int columna = nodo.getX();
        String color = nodo.getColor();
        NodoMatrizDispersa raizFila = obtenerFila(fila,true);
        NodoMatrizDispersa raizColumna = obtenerColumna(columna,true);
    
        //Inserta en columna 
        NodoMatrizDispersa cabezaNodo = raizColumna.getFilaSiguiente();
        if(cabezaNodo == null) {
            raizColumna.setFilaSiguiente(nuevoNodo);
            nuevoNodo.setFilaAnterior(raizColumna);
        } else {
            if(cabezaNodo.getY() > fila) {
                nuevoNodo.setFilaSiguiente(cabezaNodo);
                cabezaNodo.setFilaAnterior(nuevoNodo);
                raizColumna.setFilaSiguiente(nuevoNodo);
                nuevoNodo.setFilaAnterior(raizColumna);
            } else {
                NodoMatrizDispersa aux = cabezaNodo;
                boolean insertado = false;
                while(aux.getFilaSiguiente() != null) {
                    if(aux.getFilaSiguiente().getY() < fila) {
                        nuevoNodo.setFilaSiguiente(aux.getFilaSiguiente());
                        aux.getFilaSiguiente().setFilaAnterior(nuevoNodo);
                        nuevoNodo.setFilaAnterior(aux);
                        aux.setFilaSiguiente(nuevoNodo);
                        insertado = true;
                        break;
                    }
                    aux = aux.getFilaSiguiente();
                }
                if (!insertado) {
                    aux.setFilaSiguiente(nuevoNodo);
                    nuevoNodo.setFilaAnterior(aux);
                }
            }
        }
        //Inserta el fila
        cabezaNodo = raizFila.getColumnaSiguiente();
        if(cabezaNodo == null) {
            raizFila.setColumnaSiguiente(nuevoNodo);
            nuevoNodo.setColumnaAnterior(raizFila);
        } else {
            if(cabezaNodo.getX() > columna) {
                nuevoNodo.setColumnaSiguiente(cabezaNodo);
                cabezaNodo.setColumnaAnterior(nuevoNodo);
                raizFila.setColumnaSiguiente(nuevoNodo);
                nuevoNodo.setColumnaAnterior(raizFila);
            } else {
                NodoMatrizDispersa aux = cabezaNodo;
                boolean insertado = false;
                while(aux.getColumnaSiguiente() != null) {
                    if(aux.getColumnaSiguiente().getX() < columna) {
                        nuevoNodo.setColumnaSiguiente(aux.getColumnaSiguiente());
                        aux.getColumnaSiguiente().setColumnaAnterior(nuevoNodo);
                        nuevoNodo.setColumnaAnterior(aux);
                        aux.setColumnaSiguiente(nuevoNodo);
                        insertado = true;
                        break;
                    }
                    aux = aux.getColumnaSiguiente();
                }
                if(!insertado) {
                    aux.setColumnaSiguiente(nuevoNodo);
                    nuevoNodo.setColumnaAnterior(aux);
                }
            }
        }
    }
    
    public void graficarMatriz() throws IOException{
        String salida = "digraph dibujo{\nnode [shape=plaintext]\na [label=<<TABLE BORDER=\"1\" CELLBORDER=\"1\" CELLSPACING=\"0\">\n";
        for(int y = 1;y<=this.totalFilas;y++) {
            salida = salida + "<TR>  ";
            for(int x = 1;x<= this.totalColumnas;x++) {
                if(triangular(x,y) != null) {
                    salida = salida + "<TD BGCOLOR=\""+triangular(x,y).getColor()+"\"></TD>  ";
                } else {
                    salida = salida + "<TD BGCOLOR=\"#FFFFFF\"></TD>  ";
                }
            }
            salida = salida + "</TR>\n";
        }
        salida = salida+"</TABLE>>];\n}";
        File imagenSalida = new File("./capaGenerada.dot");
        if(!imagenSalida.exists()){
            imagenSalida.createNewFile();
        } else {
            imagenSalida.delete();
            imagenSalida.createNewFile();
        }
        claseMain.saveFile(salida, imagenSalida.getAbsolutePath());
        String command = "dot -Tpng capaGenerada.dot -o imagenGeneradaCapa.png"; 
        Runtime.getRuntime().exec(command);
        
        
    }
    
}