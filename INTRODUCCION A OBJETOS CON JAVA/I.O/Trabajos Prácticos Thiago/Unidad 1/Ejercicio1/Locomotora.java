
/**
 * Write a description of class Locomotora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Locomotora
{
    private boolean arrancada;
    private int velocidad;
    
    public void arrancar(){
        arrancada = true;
    }
    
    public int detener(){
        return velocidad = 0;
    }
    
    public int acelerar(){
        return velocidad = velocidad + 1;
    }
    
    public int desacelerar(){
        return velocidad  = velocidad - 1;
    }
    
    public boolean apagar(){
        return arrancada = false;
    }
    
    public boolean estaEncendida(){
        return arrancada;
    }
    
    public int velocidadActual(){
        return velocidad;
    }    
}
