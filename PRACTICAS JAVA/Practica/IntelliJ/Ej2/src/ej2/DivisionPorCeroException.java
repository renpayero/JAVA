package ej2;

public class DivisionPorCeroException {
    private int x;
    private int y;

    public DivisionPorCeroException(int x, int y) {
        super("Se intento dividir por un valor cero: " + x + "," + y);
        this.x = x;
        this.y = y;
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

}
