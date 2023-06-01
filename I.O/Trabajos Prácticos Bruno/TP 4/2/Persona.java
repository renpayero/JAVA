
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    private String nombre;
    private String apellido;
    
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setApellido(String unApellido){
        this.apellido = unApellido;
    }
    
    public String getApellido(){
        return this.apellido;
    }
}
