
/**
 * Write a description of class CuentaCorriente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaCorriente extends CuentaBancaria
{
    private int maxExt;
    private int extAct = 0;
    
    public double extraer(double unMonto){
        if(maxExt != extAct){
            extAct ++;
            return super.extraer(unMonto);
        }
        else{
            return 0;
        }
    }
}
