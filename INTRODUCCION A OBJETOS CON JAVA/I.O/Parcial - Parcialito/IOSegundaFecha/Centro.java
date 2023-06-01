import java.util.Vector;

public abstract class Centro {
	
	private Localidad localidad;
	private String nombre;
	private Vector<Sala> salas;
	
	public Centro(Localidad localidad, String nombre) {
		super();
		this.setLocalidad(localidad);
		this.setNombre(nombre);
		this.setSalas(new Vector<Sala>());
	}

	abstract public int cantidadDeMedicos();
	
	public void agregarSala(Sala sala) {
		getSalas().add(sala);
	}
	
	public int sumarAislamiento(int sum) {
		return sum;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vector<Sala> getSalas() {
		return salas;
	}

	public void setSalas(Vector<Sala> salas) {
		this.salas = salas;
	}
		
	// Aca suponemos que siempre hay espacio en alguna de las salas. De lo contrario hay que poner una variable de estado y retornarla.
	public void add(Paciente paciente) {
		for(Sala sala : getSalas())
			if (sala.add(paciente)) break;			
	}

	public void salasLlenas(Vector<Sala> salas){
		for(Sala sala : getSalas())
			sala.collectSalaLlena(salas);
	}
}
