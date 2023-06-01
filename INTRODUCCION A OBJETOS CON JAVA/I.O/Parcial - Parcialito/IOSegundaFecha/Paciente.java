import java.util.Date;

public class Paciente extends Persona {
	
	private Date fechaIngreso;
	private Localidad localidad;
	private Sala sala;
	
	public Paciente(String nombre, String dni, String direccion, Date fechaNacimiento, Date fechaIngreso,
			Localidad localidad, Sala sala) {
		super(nombre, dni, direccion, fechaNacimiento);
		this.setFechaIngreso(fechaIngreso);
		this.setLocalidad(localidad);
		this.setSala(sala);
		
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	

}
