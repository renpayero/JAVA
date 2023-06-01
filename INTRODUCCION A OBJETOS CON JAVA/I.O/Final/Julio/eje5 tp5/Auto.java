package eje5;

public class Auto extends Vehiculo {

	private float montoSeguro;

	public float getMontoSeguro() {
		return montoSeguro;
	}

	public void setMontoSeguro(float montoSeguro) {
		this.montoSeguro = montoSeguro;
	}

	@Override
	public float costoTotalAlquiler() {
		return getPrecioAlquiler() + montoSeguro;
	}
	
}
