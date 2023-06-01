package ej1;

public class Profesor implements Cliente{
    private static final int DESCUENTO=10;
    private static final int CIEN=100;

    public float aplicarDescuento(float valor){
        return valor-=(DESCUENTO*valor)/CIEN;}


}
