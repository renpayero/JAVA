
/**
 * Write a description of class Administrativo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrativo extends Empleado
{
    private int anio;
    private int categoria;
    
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    public int getAnio(){
        return this.anio;
    }
    
    public void setCategoria(int categoria){
        this.categoria = categoria;
    }
    
    public int getCategoria(){
        return this.categoria;
    }
    
    public float sueldo(){
        return anio * categoria;
    }
}
