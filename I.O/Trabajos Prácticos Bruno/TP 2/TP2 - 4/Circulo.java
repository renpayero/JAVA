
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;

public class Circulo
{
    private Punto puntoOrigen;
    private float radio;
    
    public void setPunto(Punto unPunto){
        puntoOrigen = unPunto;
    }
    
    public void setRadio(float unRadio){
        radio = unRadio;
    }
    
    public void ampliarRadio(float unValor){
        radio += unValor;
    }
    
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public void trasladarCentro(Punto unPunto){
        puntoOrigen.sumarPunto(unPunto);
    }
}
