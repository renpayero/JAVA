package eje9;

public class Sensor extends Sujeto {

	public static final int TIPO_MOVIMIENTO = 0;
	public static final int TIPO_CONTACTO = 1;
	
	public static final int ESTADO_ALERTA = 0;
	public static final int ESTADO_ESPERANDO = 1;
	public static final int ESTADO_APAGADO = 2;
	
	private int tipo;
	private int estado;
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public void evento() {
		setEstado(ESTADO_ALERTA);
		notificar();
	}
}
