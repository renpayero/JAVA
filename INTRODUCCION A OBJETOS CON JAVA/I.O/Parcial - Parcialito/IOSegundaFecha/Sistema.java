import java.util.Vector;

public class Sistema {

	private Vector<Centro> centros;

	public Sistema() {
		super();
		this.setCentros(new Vector<Centro>());
	}

	public Vector<Centro> getCentros() {
		return centros;
	}

	public void setCentros(Vector<Centro> centros) {
		this.centros = centros;
	}

	/*Agrega una sala al centro que se pasa como parametro)*/
	public void agregarNuevaSala(Centro centro, int capacidad) {
		centro.agregarSala(new Sala(capacidad));
	}
	
	/*Agrega el paciente al centro que se pasa como parametro. 
	 * Suponemos que siempre hay espacio en alguna de las salas del centro. 
	 * Pero no necesariammente en todas*/
	public void agregarPaciente(Centro centro, Paciente paciente) {
		centro.add(paciente);
	}
	
	/* Retorna la suma de los medicos de todos los centros*/
	public int cantidadDeMedicos() {
		int total = 0;
		for (Centro centro : getCentros())
			total += centro.cantidadDeMedicos();

		return total;
	}

	/* Retorna el total de los Cenros de Aislamiento*/ 
	public int totalCentroAislamiento() {
		int total = 0;
		for (Centro centro : getCentros())
			total += centro.sumarAislamiento(total);

		return total;
	}
	
	/* Retorna una coleccion con todas las salas llenas. Una sala esta llena si col.size() >= capacidadMaxima de la sala */
	public Vector<Sala> salasLlenas(){
		Vector<Sala> salasLlenas = new Vector<Sala>();
		for(Centro centro: getCentros())
			centro.salasLlenas(salasLlenas);
		return salasLlenas;
	}

	
}
