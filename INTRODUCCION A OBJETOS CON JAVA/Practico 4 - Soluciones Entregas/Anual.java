
public class Anual extends Cobro {

    private int porcentajeVariable = 10;

    @Override
    public float monto() {
        float monto = getBien().monto();
        return monto - (monto * 0.10f);
    }

}
