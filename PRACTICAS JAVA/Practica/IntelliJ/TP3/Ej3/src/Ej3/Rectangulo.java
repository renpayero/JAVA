package Ej3;

public class Rectangulo {


    private float base;
    private float altura;

    public double area(){
        return getBase()*getAltura();
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;}

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}



