package eje5;

public class Simple extends Alquiler {

	private Vehiculo vehiculo;

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public float costoTotalAlquiler() {
		return vehiculo.costoTotalAlquiler();
	}
	
	public float costoTotalVehiculo() {
		return vehiculo.getPrecio();
	}
	
	public float totalVehiculo() {
		return 1;
	}
}
