
/**
 * Write a description of class Tren here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class Tren
{
    private Locomotora locomotora;
    private List<Vagon> vagones = new ArrayList<Vagon>();
    
    public int cantLitroNecesarios(int km){
        return locomotora.cantLitrosNecesarios(km);
    }
    
    public int pesoTotal(){
        return locomotora.getPeso() + pesoVagones(vagones);
    }
    
    public boolean puedeMover(List<Vagon> vagones){
        int p = locomotora.getPotencia();
        for(Vagon v : vagones){
            p = v.descPotencia(p);
        }
        return p > 0;
    }
    
    public int cantPasajeros(List<Vagon> vagones){
        int c = 0;
        for(Vagon v : vagones){
            c += v.getCantPas();
        }
        return c;
    }
    
    public int pesoVagones(List<Vagon> vagones){
        int t = 0;
        for(Vagon v : vagones){
            t += v.getPeso();
        }
        return t;
    }
}
