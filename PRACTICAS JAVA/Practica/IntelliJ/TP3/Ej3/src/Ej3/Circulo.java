package Ej3;

public class Circulo {


    private float radio;


    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double area(){
        return Math.PI*(radio*radio);
    }


}
