
/**
 * Write a description of class Unico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Unico extends Pasajero
{
    private Pasaje unico;
    
    public double montoTotal(){
        return unico.getMontoPasajero();
    }
    
    public double cantidadPasajeros(){
        return 1;
    }
}
