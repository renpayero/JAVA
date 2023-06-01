package eje5;

import java.util.ArrayList;
import java.util.List;

public class Flota extends Alquiler {

	private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public void addVehiculos(List<Vehiculo> e) {
		vehiculos.addAll(e);
	}
	
	public void addVehiculo(Vehiculo e) {
		vehiculos.add(e);
	}
	
	public void removeVehiculo(Vehiculo e) {
		vehiculos.remove(e);
	}
	
	public float costoTotalAlquiler() {
		float t = 0;
		
		for(Vehiculo v:vehiculos) {
			t+=v.costoTotalAlquiler();
		}
		
		return t - (t * 0.05f);
	}
	
	public float costoTotalVehiculo() {
		float t = 0;
		
		for(Vehiculo v:vehiculos) {
			t+=v.getPrecio();
		}
		
		return t;
	}
	
	public float totalVehiculo() {
		return vehiculos.size();
	}
}
