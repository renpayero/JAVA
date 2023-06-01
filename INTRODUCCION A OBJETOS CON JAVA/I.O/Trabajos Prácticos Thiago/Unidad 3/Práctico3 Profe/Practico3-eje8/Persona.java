import java.util.Date;

public class Persona
{
    //Constante siempre may..
    public static int MASCULINO = 0;
    public static int FEMENINO = 1;
    //Persona.MASCULINO
    //Persona.FEMENINO
    
    private String nombre;
    private String dni;
    private String dirección;
    private Date fechaNacimiento;
    private int sexo;
    
    //TODO Agregar el resto de los atributos
    
    public Persona()
    {
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    //TODO Agregar el resto de los setters/getters
}
