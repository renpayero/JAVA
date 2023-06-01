/**
 * Abstract class Pasajero - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Pasajero
{
    private Persona pasajero;
    
    public void setPasajero(Persona unPasajero){
        this.pasajero = unPasajero;
    }
    
    public Persona getPasajero(){
        return pasajero;
    }
    
    public abstract double montoPasajero(double precioBase);
}
