/**
 * Write a description of class Simple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simple extends Alquiler
{
    private Cliente cliente;
    private Vehiculo vehiculo;
    
    public Simple(Cliente cliente, Vehiculo vehiculo){
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }
    
    public double montoAlquilerDe(){
        return vehiculo.montoAlquilerDe();
    }
    
    public double montoTotalVehiculo(){
        return vehiculo.getPrecioVehiculo();
    }
    
    public int totalVehiculosAlquilados(){
        return 1;
    }
}
