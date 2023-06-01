package eje8;

public class Cuota extends Cobro {

	@Override
	public float montoAPagarBien(Moto moto) {
		return moto.getValorFiscal();
	}

	@Override
	public float montoAPagarBien(Auto auto) {
		return auto.getValorFiscal()*0.05f;
	}
	
	@Override
	public float montoAPagarBien(Inmueble inmueble) {
		return inmueble.getValorFiscal()*0.02f;
	}

	public float montoAPagarBien(Embarcacion embarcacion) {
		return embarcacion.getValorFiscal()*0.03f;
	}
}
