package ejercicio1;

public class CajaAhorro extends CuentaBancaria {
    private static final int LIMITE=10;
    private static final int CANTIDAD_EXTRACCIONES= 5;
    private int cantidadExtActual=0;



    public CajaAhorro() {
        super(LIMITE);
        cantidadExtActual=CANTIDAD_EXTRACCIONES;
    }


    public int getCantidadExtActualActual() {
        return cantidadExtActual;
    }

    @Override
    public boolean extraer(double unMonto) throws  SuperaCantidadExtraccionesException, SuperaLimiteMinimoException{
        if(cantidadExtActual>=0 && super.extraer(unMonto)){
            cantidadExtActual--;
            return true;}
        else{
            throw new SuperaCantidadExtraccionesException();
        }
    }
}
