import java.util.*;
public abstract class Test
{
    private Persona persona;
    private Date fechaInicio;
    
    public void setPersona(Persona persona){
        this.persona=persona;
    }
    public Persona getPersona(){
        return persona;
    }
    
    public void setFechaInicio(){
        this.fechaInicio=fechaInicio;
    }
    public Date getFechaInicio(){
        return fechaInicio;
    }
    
    public abstract double calcularTiempo();
    
    public abstract int esSerologico();
}
