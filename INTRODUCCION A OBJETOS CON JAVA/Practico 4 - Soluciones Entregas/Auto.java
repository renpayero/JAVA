
public class Auto extends Bien {

	@Override
	public float monto() {
		return getValorFiscal() *1.05f;
	}
	
}
