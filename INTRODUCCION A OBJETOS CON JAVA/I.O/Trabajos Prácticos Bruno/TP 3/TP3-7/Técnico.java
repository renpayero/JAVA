
/**
 * Write a description of class Técnico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Técnico extends Empleado
{
    private float montoContrato;
    
    public void setMontoContrato(float montoContrato){
        this.montoContrato = montoContrato;
    }
    
    public float getMontoContrato(){
        return this.montoContrato;
    }
    
    public float sueldo(){
        return this.montoContrato;
    }
}
