package eje4;

import java.util.Date;
import java.util.List;

public class Tanque {

	private float capMaxima;
	private float capActual;
	private String numero;
	private Date fechaFuncionamiento;
		
	public float getCapMaxima() {
		return capMaxima;
	}
	public void setCapMaxima(float capMaxima) {
		this.capMaxima = capMaxima;
	}
	public float getCapActual() {
		return capActual;
	}
	public void setCapActual(float capActual) {
		this.capActual = capActual;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getFechaFuncionamiento() {
		return fechaFuncionamiento;
	}
	public void setFechaFuncionamiento(Date fechaFuncionamiento) {
		this.fechaFuncionamiento = fechaFuncionamiento;
	}
	
	public float capacidadDisponiblew() {
		return capMaxima - capActual;
	}
	
	public void tanquesCombustibleMenorA(List<Tanque> tanques, int cantidad) {
		if(cantidad>capActual)
			tanques.add(this);
	}
}
