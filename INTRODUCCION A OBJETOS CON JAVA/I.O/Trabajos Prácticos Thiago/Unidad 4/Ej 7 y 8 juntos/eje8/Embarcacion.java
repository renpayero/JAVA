package eje8;

public class Embarcacion extends Bien {

	@Override
	public float montoAPagar(Cobro cobro) {
		return cobro.montoAPagarBien(this);
	}
	
}
