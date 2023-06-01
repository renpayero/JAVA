/**
 * Abstract class Pasaje - write a description of the class here
 * 
 * @author: 
 * Date: 
 */

import java.util.Date;

public abstract class Pasaje
{
    private Pasajero pasajero;
    private Date fecha;
    private double precioBase;
    
    public void setPrecioBase(double unPrecio){
        this.precioBase = unPrecio;
    }
    
    public double getPrecioBase(){
        return precioBase;
    }
    
    public double getMontoPasajero(){
        return pasajero.montoPasajero(precioBase);
    }
    
    public abstract double montoTotal();
    
    public abstract double cantidadPasajeros();
}
