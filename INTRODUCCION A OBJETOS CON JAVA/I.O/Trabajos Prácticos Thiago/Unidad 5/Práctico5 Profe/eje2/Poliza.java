package eje2;

import java.util.Date;

public abstract class Poliza {

	private Auto auto;
	private String nombre;
	private Date fechaAlta;
	private Date fechaVencimiento;
	
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public float montoValuacion() {
		return getAuto().getPrecio();
	}
	public abstract float monto();
	
}
