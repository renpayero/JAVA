
/**
 * Write a description of class Film here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Film
{
    private String nombre; /** Nombre de la pelicula **/
    private double costo;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setCosto(double costo){
        this.costo = costo;
    }
    
    public double getCosto(){
        return costo;
    }
}
