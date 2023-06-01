
/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Vector;
import java.util.List;
import java.util.ArrayList;

public class Flota extends Alquiler
{
    private Cliente cliente;
    private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    
    public Flota(Cliente cliente, Vector<Vehiculo> vehiculos){
        this.cliente = cliente;
        for(int i=0; i < vehiculos.size(); i++){
            this.vehiculos.add(vehiculos.elementAt(i));
        }
    }
    
    public double montoAlquilerDe(){
        double t = 0;
        for(Vehiculo v : vehiculos){
            t += v.montoAlquilerDe();
        }
        return t - (5 * 100 / t);
    }
    
    public double montoTotalVehiculo(){
        double t = 0;
        for(Vehiculo v : vehiculos){
            t += v.getPrecioVehiculo();
        }
        return t;
    }
    
    public int totalVehiculosAlquilados(){
        return vehiculos.size();
    }
}
