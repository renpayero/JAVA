package eje4;

import java.util.ArrayList;
import java.util.List;

public class Estacion {

    private List<Surtidor> surtidores = new ArrayList<Surtidor>();
    
    public void addSurtidor(Surtidor e) {
        surtidores.add(e);
    }
    
    public void removeSurtidor(Surtidor e) {
        surtidores.remove(e);
    }
    
    public float capitalActual() {
        float t = 0;
        
        for(Surtidor s:surtidores) 
            t+=s.getPrecioBasico();
        
        return t;
    }
    
    public List<Tanque> tanquesCombustibleMenorA(int cantidad) {        
         List<Tanque> tanques = new ArrayList<Tanque>();
        
        for(Surtidor s:surtidores) 
            s.tanquesCombustibleMenorA(tanques, cantidad);      
        
        return tanques;
    }
    
}
