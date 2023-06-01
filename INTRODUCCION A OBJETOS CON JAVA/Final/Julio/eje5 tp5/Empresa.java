package eje5;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nombre;
	private String direccion;
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Alquiler> alquileres = new ArrayList<Alquiler>();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void addCliente(Cliente e) {
		clientes.add(e);
	}
	
	public void removeCliente(Cliente e) {
		clientes.remove(e);
	}
	
	public void addAlquiler(Alquiler e) {
		alquileres.add(e);
	}
	
	public void removeAlquiler(Alquiler e) {
		alquileres.remove(e);
	}
	
	public void registrarAlquiler(Cliente cliente, Vehiculo vehiculo) {
		Simple s = new Simple();
		
		s.setVehiculo(vehiculo);
		s.setCliente(cliente);
		
		addAlquiler(s);
	}
	
	public void registrarAlquiler(Cliente cliente, List<Vehiculo> vehiculos) {
		Flota f = new Flota();
		
		f.addVehiculos(vehiculos);
		f.setCliente(cliente);
				
		addAlquiler(f);
	}
	
	public float montoAlquilerDe(Alquiler alquiler) {
		return alquiler.costoTotalAlquiler();
	}
	
	public float float​montoTotalAlquileres​() {
		float t = 0;
		
		for(Alquiler a:alquileres) {
			t+=a.costoTotalAlquiler();
		}
		
		return t;
	}
 
	public float montoTotalVehiculos() {
		float t = 0;
		
		for(Alquiler a:alquileres) {
			t+=a.costoTotalVehiculo();
		}
		
		return t;
	}
	
	public int totalVehiculosAlquilados() {
		int t = 0;
		
		for(Alquiler a:alquileres) {
			t+=a.totalVehiculo();
		}
		
		return t;
	}
 
}
