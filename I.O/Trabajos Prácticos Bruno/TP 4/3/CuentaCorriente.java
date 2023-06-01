
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
    
    public void setMaxExt(int maxExt){
        this.maxExt = maxExt;
    }
    
    public int getMaxExt(){
        return this.maxExt;
    }
    
    public void setExtAct(int extAct){
        this.extAct = extAct;
    }
    
    public int getExtAct(){
        return this.extAct;
    }
    
    public void extraer(double unMonto){
        if(maxExt != extAct){
            extAct++;
            super.extraer(unMonto);
        }
    }
}
