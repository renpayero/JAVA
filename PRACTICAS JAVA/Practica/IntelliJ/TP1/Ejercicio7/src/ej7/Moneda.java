package ej7;

public enum Moneda {

    DOLAR(97.03f), YEN(0.89f) , EURO(114.17f);



    private final float monto;

    Moneda(float monto){
        this.monto=monto;}

    public float monto(){return monto;}



}
