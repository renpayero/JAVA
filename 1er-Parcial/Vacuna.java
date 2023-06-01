import java.util.Date;

public abstract class Vacuna
{
    private String lote;
    private String partida;
    private Date fechaElaboracion;
    private Laboratorio laboratorio;
    private Persona persona;
    
    public Vacuna(Persona persona, Laboratorio laboratorio)
    {
        setPersona(persona);
        setLaboratorio(laboratorio);
    }
    
    public void setPersona(Persona p) {
        persona = p;
    }
    
    public void setLaboratorio(Laboratorio l) {
        laboratorio = l;
    }
    
    public abstract int cantidadComponentes();
    
    public abstract int cantidadVacunasSimpleAplicadas();
}
