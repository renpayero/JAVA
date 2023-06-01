
/**
 * Write a description of class Serie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Serie
{
    private Film unaSerie;
    private Capitulo unCapitulo;
    private Director unDirector;
    private Actor unActor;
    private double totalPrecio;
    
    public void setUnaSerie(Film unaSerie){
        this.unaSerie = unaSerie;
    }
    
    public Film getUnaSerie(){
        return unaSerie;
    }
    
    public void setUnCapitulo(Capitulo unCapitulo){
        this.unCapitulo = unCapitulo;
    }
    
    public Capitulo getUnCapitulo(){
        return unCapitulo;
    }
    
    public void setUnDirector(Director unDirector){
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
    
    public void setTotalPrecio(double precio){
        totalPrecio = unCapitulo.costo(precio);
    }
}