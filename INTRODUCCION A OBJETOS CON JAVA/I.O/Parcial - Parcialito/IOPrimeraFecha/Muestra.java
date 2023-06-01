
public class Muestra {
	
	private String tipo;
	private boolean positivo;
	
	public Muestra(String tipo, boolean positivo) {
		super();
		this.setTipo(tipo);
		this.setPositivo(positivo);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isPositivo() {
		return positivo;
	}

	public void setPositivo(boolean positivo) {
		this.positivo = positivo;
	}
	
}
