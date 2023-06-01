import java.util.Vector;

public class Sala {
	
	private int max;
	private Vector<Paciente> pacientes;
	
	public Sala(int max) {
		super();
		this.setMax(max);
		this.setPacientes(new Vector<Paciente>());
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public Vector<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(Vector<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	public boolean add(Paciente paciente) {
		return !salaLlena() ? getPacientes().add(paciente) : false;
	}

	private boolean salaLlena() {
		return getPacientes().size() >= max;
	}
	
	public boolean collectSalaLlena(Vector<Sala> salas){
		return salaLlena() ? salas.add(this) : false;
	}
	
	public int cantidadDePacientes() {
		return getPacientes().size();
	}
}
