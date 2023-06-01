package eje2;

public class Total extends Poliza {

	@Override
	public float monto() {
		return 180 + (getAuto().getPrecio() * 0.1f);
	}

}
