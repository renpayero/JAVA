
/**
 * Write a description of class Surtidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public abstract class Surtidor
{
    private int precioBase;
    private Tanque tanque;
    
    public double montoACobrar(int l){
        return recargo(l * precioBase);
    }
    
    public abstract double recargo(double p);
    
    public double capitalActual(){
        return tanque.getCapAct() * precioBase;
    }
    
    public void incrementarPrecio(int p){
        precioBase = precioBase + (p * 100 / precioBase);
    }
    
    public void tanqueCombustibleMenorA(int c, List<Tanque> lista){
        tanque.tanqueCombustibleMenorA(c, lista);
    }
}
