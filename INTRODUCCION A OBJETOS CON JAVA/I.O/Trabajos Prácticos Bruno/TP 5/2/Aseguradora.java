
/**
 * Write a description of class Aseguradora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class Aseguradora
{
    private List<Poliza> polizas = new ArrayList<Poliza>();
    
    public double montoAPagarDe(Poliza unaPoliza){
        return unaPoliza.montoAPagar();
    }
    
    public double montoTotalAsegurado(){
        double t = 0;
        for(Poliza p : polizas){
            t += p.montoAPagar();
        }
        return t;
    }
    
    public double montoTotalACobrar(){
        double t = 0;
        for(Poliza p : polizas){
            t += p.montoAPagar();
        }
        return t;
    }
    
    public void asegurarAutoTotal(Auto a, String n){
        polizas.add(new Total(a, n));
    }
    
    public int cantPolizas(){
        return polizas.size();
    }
}
