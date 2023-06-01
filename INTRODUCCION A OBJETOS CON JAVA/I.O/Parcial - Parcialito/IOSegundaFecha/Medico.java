import java.util.Date;

public class Medico extends Persona{
	
	private String matricula;
	private String especialidad;
	
	public Medico(String nombre, String dni, String direccion, Date fechaNacimiento, String matricula,
			String especialidad) {
		super(nombre, dni, direccion, fechaNacimiento);
		this.setMatricula(matricula);
		this.setEspecialidad(especialidad);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	

}
