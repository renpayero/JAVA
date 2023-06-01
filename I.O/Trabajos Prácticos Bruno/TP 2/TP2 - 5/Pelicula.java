
/**
 * Write a description of class Pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula
{
    private Film unaPelicula;
    private Fecha fecha;
    private Director unDirector;
    private Actor unActor;
    
    public void setUnaPelicula(Film unaPelicula){
        this.unaPelicula = unaPelicula;
    }
    
    public Film getUnaPelicula(){
        return unaPelicula;
    }
    
    public void setFecha(Fecha fecha){
        this.fecha = fecha;
    }
    
    public Fecha getFecha(){
        return fecha;
    }
    
    public void setUnDirector(Director unDirecto){
        this.unDirector = unDirector;
    }
    
    public Director getUnDirector(){
        return unDirector;
    }
    
    public void setUnActor(Actor unActor){
        this.unActor = unActor;
    }
    
    public Actor getUnActor(){
        return unActor;
    }
}
