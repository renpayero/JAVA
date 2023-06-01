package eje4;

public class NaftaPremium extends Surtidor {

	@Override
	public float precioTotal() {
		return getPrecioBasico() * 1.15f;
	}

}
