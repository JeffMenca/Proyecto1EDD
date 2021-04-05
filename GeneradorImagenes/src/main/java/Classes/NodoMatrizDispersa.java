package Classes;

/**
 *
 * @author Jeffrey
 */

public class NodoMatrizDispersa {

    int x;
    int y;
    String color;
    NodoMatrizDispersa columnaAnterior, filaAnterior, columnaSiguiente, filaSiguiente;

    public NodoMatrizDispersa(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
        columnaAnterior = filaAnterior = null;
        columnaSiguiente = filaSiguiente = null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public NodoMatrizDispersa getColumnaAnterior() {
        return columnaAnterior;
    }

    public void setColumnaAnterior(NodoMatrizDispersa columnaAnterior) {
        this.columnaAnterior = columnaAnterior;
    }

    public NodoMatrizDispersa getFilaAnterior() {
        return filaAnterior;
    }

    public void setFilaAnterior(NodoMatrizDispersa filaAnterior) {
        this.filaAnterior = filaAnterior;
    }

    public NodoMatrizDispersa getColumnaSiguiente() {
        return columnaSiguiente;
    }

    public void setColumnaSiguiente(NodoMatrizDispersa columnaSiguiente) {
        this.columnaSiguiente = columnaSiguiente;
    }

    public NodoMatrizDispersa getFilaSiguiente() {
        return filaSiguiente;
    }

    public void setFilaSiguiente(NodoMatrizDispersa filaSiguiente) {
        this.filaSiguiente = filaSiguiente;
    }
    
}
