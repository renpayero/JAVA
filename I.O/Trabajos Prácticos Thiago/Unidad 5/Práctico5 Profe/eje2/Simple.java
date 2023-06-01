package eje2;

public class Simple extends Poliza {

	@Override
	public float monto() {
		return 100 + (getAuto().getPrecio() * 0.07f);
	}

}
