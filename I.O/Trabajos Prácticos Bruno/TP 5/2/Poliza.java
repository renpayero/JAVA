/**
 * Abstract class Poliza - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Poliza
{
    private Auto auto;
    private String nombre;
    
    public void Poliza(Auto a, String n){
        this.auto = a;
        this.setNombre(n);
    }
    
    public abstract double montoAPagar();
    
    public double montoAuto(){
        return auto.getValuacion();
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
}
