package ej1;

public class Alumno implements Cliente {
    private static final int DESCUENTO=20;
    private static final int CIEN=100;

    public float aplicarDescuento(float valor){
        return valor-=(DESCUENTO*valor)/CIEN;}

}
