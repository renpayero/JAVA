import java.util.Vector;

public class Intensivo extends Centro{
	
	private Vector<Medico> medicos;
	
	public Intensivo(Localidad localidad, String nombre) {
		super(localidad, nombre);
		this.setMedicos(new Vector<Medico>());
	}

	public void add(Medico medico) {
		getMedicos().add(medico);
	}
	
	public Vector<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(Vector<Medico> medicos) {
		this.medicos = medicos;
	}

	@Override
	public int cantidadDeMedicos() {
		return getMedicos().size();
	}	

}
