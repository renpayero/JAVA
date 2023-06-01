package eje8;

public class Anual extends Cobro {

	private int porcentajeVariable = 10;

	@Override
	public float montoAPagarBien(Moto moto) {
		float monto = moto.getValorFiscal()*(porcentajeVariable/100);
		return monto - (monto * 0.10f);
	}

	@Override
	public float montoAPagarBien(Auto auto) {
		float monto = auto.getValorFiscal()*0.05f;
		return monto - (monto * 0.10f);
	}

	@Override
	public float montoAPagarBien(Inmueble inmueble) {
		float monto = inmueble.getValorFiscal()*0.02f;
		return monto - (monto * 0.10f);
	}
	
	public float montoAPagarBien(Embarcacion embarcacion) {
		float monto = embarcacion.getValorFiscal()*0.03f;
		return monto - (monto * 0.10f);
	}

	public int getPorcentajeVariable() {
		return porcentajeVariable;
	}

	public void setPorcentajeVariable(int porcentajeVariable) {
		this.porcentajeVariable = porcentajeVariable;
	}

}
