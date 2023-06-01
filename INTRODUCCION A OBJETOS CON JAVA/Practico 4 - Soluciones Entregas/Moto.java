
public class Moto extends Bien {

	public  float porcentaje;

	@Override
	public float monto() {
		return getValorFiscal() - (getValorFiscal() * getPorcentaje());
	}

	private float getPorcentaje() {
		return this.porcentaje;
	}

}
