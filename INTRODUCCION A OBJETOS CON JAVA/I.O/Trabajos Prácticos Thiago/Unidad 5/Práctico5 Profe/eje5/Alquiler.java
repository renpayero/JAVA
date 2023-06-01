package eje5;

import java.util.Date;

public abstract class Alquiler {

	private Date fecha;
	private Cliente cliente;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public abstract float costoTotalAlquiler();
	
	public abstract float costoTotalVehiculo();
	
	public abstract float totalVehiculo();
	
}
