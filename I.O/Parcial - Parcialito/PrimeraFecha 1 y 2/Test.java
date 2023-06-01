import java.util.Date;

public abstract class Test
{
    private Date fecha;
    private Persona persona;
    
    public Test()
    {
    }

    public abstract int tiempo();
    
    public Persona getPersona(){
        return persona;
    }
    
    public void setPersona(Persona p){
        persona = p;
    }

    //SOLUCIONES CONSIDERADAS
    public abstract boolean esSerologico1();

    public abstract int esSerologico2();
    
    //CORRECTA
    public abstract int contarSerologico(int t);

}
