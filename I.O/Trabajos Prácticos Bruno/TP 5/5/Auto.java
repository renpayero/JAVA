
/**
 * Write a description of class Auto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auto extends Vehiculo
{
    private double precioVehiculo;
    private double montoSeguro;
    
    public void setPrecioVehiculo(double precio){
        this.precioVehiculo = precio;
    }
    
    public double getPrecioVehiculo(){
        return this.precioVehiculo;
    }
    
    public void setMontoSeguro(double monto){
        this.montoSeguro = monto;
    }
    
    public double getMontoSeguro(){
        return this.montoSeguro;
    }
    
    public double montoAlquilerDe(){
        return precioVehiculo + montoSeguro;
    }
}
