package eje8;

import java.util.Date;

public abstract class Cobro {

	private Date fecha;
	private Bien bien;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Bien getBien() {
		return bien;
	}
	public void setBien(Bien bien) {
		this.bien = bien;
	}	
	
	public float montoAPagar() {
		return bien.montoAPagar(this);
	}
		
	public abstract float montoAPagarBien(Moto moto);
	
	public abstract float montoAPagarBien(Auto auto);
	
	public abstract float montoAPagarBien(Inmueble inmueble);
	
	public abstract float montoAPagarBien(Embarcacion embarcacion);
}
