package ejercicio1;

public class CuentaBancaria {

    private double monto;
    private int limite;


    public CuentaBancaria(int limite) {
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean depositar(double unMonto){
        monto+=unMonto;
        return true;
    }

    public boolean extraer(double unMonto) throws SuperaCantidadExtraccionesException, SuperaLimiteMinimoException{
        if(monto-unMonto >=limite){
            monto-=unMonto;
            return true;}
        else{
            throw new SuperaCantidadExtraccionesException();
        }
    }


}
