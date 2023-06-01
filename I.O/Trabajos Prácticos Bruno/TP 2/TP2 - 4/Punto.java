
/**
 * Write a description of class Punto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto
{
    private int x;
    private int y;
    
    public void sumarValor(int unValor){
        x += unValor;
        y += unValor;
    }
    
    public void sumarPunto(Punto unPunto){
        x += unPunto.getX();
        y += unPunto.getY();
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public float distanciaDe(Punto unPunto){
        return (this.x - unPunto.getX())^2 + (this.y - unPunto.getY())^2;
    }
    
    public float distanciaAlOrigen(){
        return distanciaDe(new Punto());
    }
}