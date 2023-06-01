import java.util.Date;

public abstract class Test {

    private Persona persona;
    private Date fecha;

    abstract public double tiempo();

    public Test(Persona persona, Date fecha) {
        setPersona(persona);
        setFecha(fecha);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int sumarSerologico(int valor) {
    	return valor;    	
    }    
    
}
