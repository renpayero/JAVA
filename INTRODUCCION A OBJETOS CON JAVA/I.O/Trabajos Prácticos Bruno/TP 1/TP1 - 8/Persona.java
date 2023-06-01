
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
    private float peso;
    private String pelo;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
    public void setPelo(String pelo){
        this.pelo = pelo;
    }
    
    public String getPelo(){
        return this.pelo;
    }
    
}
