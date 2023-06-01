package eje5;

public class Camion extends Vehiculo {

	@Override
	public float costoTotalAlquiler() {
		return getPrecioAlquiler() + (getPrecio() * 0.05f);
	}

}
