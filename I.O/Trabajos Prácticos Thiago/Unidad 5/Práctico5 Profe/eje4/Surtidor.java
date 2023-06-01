package eje4;

import java.util.List;

public abstract class Surtidor {

	private float precioBasico;
	private Tanque tanque;

	public Tanque getTanque() {
		return tanque;
	}

	public void setTanque(Tanque tanque) {
		this.tanque = tanque;
	}

	public float getPrecioBasico() {
		return precioBasico;
	}

	public void setPrecioBasico(float precioBasico) {
		this.precioBasico = precioBasico;
	}
	public float montoACobrar(int litros) {
		return litros * precioTotal();
	}
	
	public void tanquesCombustibleMenorA(List<Tanque> tanques, int cantidad) {
		tanque.tanquesCombustibleMenorA(tanques, cantidad);
	}
	
	public abstract float precioTotal(); 
	
}
