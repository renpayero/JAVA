
/**
 * Write a description of class Camión here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camión extends Vehiculo
{
    private double precioVehiculo;
    
    public void setPrecioVehiculo(double precio){
        this.precioVehiculo = precio;
    }
    
    public double getPrecioVehiculo(){
        return this.precioVehiculo;
    }
    
    public double montoAlquilerDe(){
        return precioVehiculo + (5 * 100 / precioVehiculo);
    }
}
