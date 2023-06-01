/**
 * Abstract class Alquiler - write a description of the class here
 * 
 * @author: 
 * Date: 
 */

import java.util.Date;

public abstract class Alquiler
{
    private Date fecha;
    
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    
    public Date getFecha(){
        return this.fecha;
    }
    
    public abstract double montoAlquilerDe();
    
    public abstract double montoTotalVehiculo();
    
    public abstract int totalVehiculosAlquilados();
}
