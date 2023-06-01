package eje8;

public class Inmueble extends Bien {

	@Override
	public float montoAPagar(Cobro cobro) {
		return cobro.montoAPagarBien(this);
	}
	
}
