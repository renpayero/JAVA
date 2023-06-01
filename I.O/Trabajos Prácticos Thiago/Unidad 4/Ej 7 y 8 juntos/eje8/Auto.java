package eje8;

public class Auto extends Bien {

	@Override
	public float montoAPagar(Cobro cobro) {
		return cobro.montoAPagarBien(this);
	}
	
}
