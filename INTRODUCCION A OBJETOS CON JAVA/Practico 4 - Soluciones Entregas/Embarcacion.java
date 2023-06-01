
public class Embarcacion extends Bien {

    @Override
    public float monto() {
        return getValorFiscal() - (getValorFiscal() * 0.03f);
    }
    
}
