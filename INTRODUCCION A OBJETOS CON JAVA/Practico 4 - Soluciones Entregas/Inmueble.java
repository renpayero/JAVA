
public class Inmueble extends Bien {

	@Override
	public float monto() {
		return getValorFiscal() - (getValorFiscal() * 0.02f);
	}

	
}
