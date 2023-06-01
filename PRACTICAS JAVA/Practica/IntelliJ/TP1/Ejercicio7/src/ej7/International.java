package ej7;

public class International extends Transaccion {
    private static final float IMPUESTO=1.10f;
    private Moneda moneda;


    @Override
    public float montoPesos(){return getMonto()*moneda.monto();}


    public float montoConImpuestos(){
        return montoPesos()*IMPUESTO;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
}
