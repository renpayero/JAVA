package eje8;

public class Moto extends Bien {

	@Override
	public float montoAPagar(Cobro cobro) {
		return cobro.montoAPagarBien(this);
	}
	
}
