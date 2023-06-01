
/**
 * Write a description of class Locomotora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Locomotora
{
    private boolean encendida;
    private int velocidad;
    
    
    public void arrancar () {
        encendida = true;
    }
    
    public void detener () {
        velocidad = 0;
    }
    
    public void acelerar () {
        velocidad++;
    }
    
    public void apagar () {
        encendida = false;
    }
    
    public boolean estEncendida () {
        return encendida;
    }
    
    public int velocidadActual () {
        return velocidad;
    }
    
    
}
