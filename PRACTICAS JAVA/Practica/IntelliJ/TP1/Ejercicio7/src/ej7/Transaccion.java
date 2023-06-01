package ej7;

public abstract class Transaccion {

    private float monto;


    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;}

    public abstract float montoPesos();
    public abstract float montoConImpuestos();


}
