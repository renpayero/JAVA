package eje4;

public class Gasoil extends Surtidor {

	@Override
	public float precioTotal() {
		return getPrecioBasico() * 1.05f;
	}

}
