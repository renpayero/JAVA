package ej1;

public class Punto {


    private int x;
    private int y;

    public Punto(int x, int y){
        setX(x);
        setY(y);
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



    public void sumar(int v){
        this.setX(getX()+v);

    }

    public void sumar(Punto unPunto){
        x+= unPunto.getX();
        y+=unPunto.getY();
    }


    public int distancia(Punto unPunto){
        return 0;
    }






}
