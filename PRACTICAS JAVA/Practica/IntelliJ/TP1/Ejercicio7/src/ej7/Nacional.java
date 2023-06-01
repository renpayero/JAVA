package ej7;

public class Nacional extends Transaccion {
    private static final float IMPUESTO=1.08f;

    @Override
    public float montoPesos(){return getMonto();}


    public float montoConImpuestos(){
        return montoPesos()*IMPUESTO;
    }





}
