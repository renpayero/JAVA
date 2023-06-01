
/**
 * Write a description of class Parcial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parcial extends Poliza
{
    public Parcial(Auto a, String n){
        super.Poliza(a, n);        
    }
    
    public double montoAPagar(){
        return super.montoAuto() * 1.07 + 100;
    }
}
