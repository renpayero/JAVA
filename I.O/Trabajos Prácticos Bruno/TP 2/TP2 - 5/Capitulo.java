
/**
 * Write a description of class Capitulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Capitulo
{
    private String nombre; /** Nombre del capitulo **/
    private Fecha fecha;
    private double costo;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setFecha(Fecha fecha){
        this.fecha = fecha;
    }
    
    public Fecha getFecha(){
        return fecha;
    }
    
    public void setCosto(double costo){
        this.costo = costo;
    }
    
    public double getCosto(){
        return costo;
    }
}
