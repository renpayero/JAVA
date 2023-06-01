
/**
 * Write a description of class Total here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Total extends Poliza
{
    public Total(Auto a, String n){
         super.Poliza(a, n);
    }
     
    public double montoAPagar(){
        return super.montoAuto() * 1.10 + 180;
    }
}
