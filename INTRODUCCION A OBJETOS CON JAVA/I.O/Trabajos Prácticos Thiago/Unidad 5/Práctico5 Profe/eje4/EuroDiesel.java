package eje4;

public class EuroDiesel extends Surtidor {

	@Override
	public float precioTotal() {
		return getPrecioBasico() * 1.10f;
	}

}
