/**
 * Write a description of class EstacionServicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class EstacionServicio
{
    private List<Surtidor> surtidores = new ArrayList<Surtidor>();
    
    public double capitalActual(){
        double t = 0;
        for(Surtidor s : surtidores){
            t += s.capitalActual();
        }
        return t;
    }
    
    public List tanqueConCombustibleMenorA(int c){
        List<Tanque> lista = new ArrayList<Tanque>();
        for(Surtidor s : surtidores){
            s.tanqueCombustibleMenorA(c, lista);
        }
        return lista;
    }
    
    public void incrementarValorCombustible(int p){
        for(Surtidor s : surtidores){
            s.incrementarPrecio(p);
        }
    }
}
