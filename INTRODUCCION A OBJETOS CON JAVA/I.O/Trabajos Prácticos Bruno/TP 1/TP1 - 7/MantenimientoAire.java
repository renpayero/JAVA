
/**
 * Write a description of class MantenimientoAire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MantenimientoAire
{
    private String nombre;
    private String apellido;
    private int dni;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public int getDni(){
        return dni;
    }
}
