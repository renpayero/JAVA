
/**
 * Write a description of class Tanque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class Tanque
{
    private int capAct;
    private int capMax;
    
    public Tanque(int capAct, int capMax){
        this.setCapAct(capAct);
        this.setCapMax(capMax);
    }
    
    public void setCapAct(int cap){
        this.capAct = cap;
    }
    
    public int getCapAct(){
        return this.capAct;
    }
    
    public void setCapMax(int cap){
        this.capMax = cap;
    }
    
    public int getCapMax(){
        return this.capMax;
    }
    
    public double capacidadDisponible(){
        return capMax - capAct;
    }
    
    public void tanqueCombustibleMenorA(int c, List<Tanque> lista){
        if(capacidadDisponible() <= c){
            lista.add(this);
        }
    }
}
