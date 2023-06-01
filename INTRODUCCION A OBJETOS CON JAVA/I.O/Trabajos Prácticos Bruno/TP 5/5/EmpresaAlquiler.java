
/**
 * Write a description of class EmpresaAlquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class EmpresaAlquiler
{
    private String nombre;
    private String direccion;
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void registrarAlquiler(Cliente cliente, Vehiculo vehiculo){
        alquileres.add(new Simple(cliente, vehiculo));
    }
    
    public void registrarAlquiler(Cliente cliente, Vector<Vehiculo> vehiculos){
        alquileres.add(new Flota(cliente, vehiculos));
    }
    
    public double montoAlquilerDe(Alquiler alquiler){
        return alquiler.montoAlquilerDe();
    }
    
    public double montoTotalALquileres(){
        double t = 0;
        for(Alquiler a : alquileres){
            t += a.montoAlquilerDe();
        }
        return t;
    }
    
    public double montoTotalVehiculos(){
        double t = 0;
        for(Alquiler a : alquileres){
            t += a.montoTotalVehiculo();
        }
        return t;
    }
    
    public int totalVehiculosAlquilados(){
        int t = 0;
        for(Alquiler a : alquileres){
            t += a.totalVehiculosAlquilados();
        }
        return t;
    }
}
