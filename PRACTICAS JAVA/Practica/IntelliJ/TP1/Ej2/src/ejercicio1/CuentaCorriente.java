package ejercicio1;

public class CuentaCorriente extends CuentaBancaria {
    private static final int LIMITE=-150;

    public CuentaCorriente() {
        super(LIMITE);

    }

    @Override
    public boolean extraer(double unMonto) {
        return super.extraer(unMonto);
    }
}
