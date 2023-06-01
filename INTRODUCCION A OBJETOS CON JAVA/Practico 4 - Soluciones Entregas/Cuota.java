
public class Cuota extends Cobro {

	@Override
	public float monto() {
		return getBien().monto();
	}

}
