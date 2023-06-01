
/**
 * Write a description of class Carga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carga extends Vagon
{
    private int carga;
    
    public void setCarga(int c){
        this.carga = c;
    }
    
    public int getCarga(){
        return carga;
    }
    
    public int getCantPas(){
        return 0;
    }
    
    public int getPeso(){
        return getPesoEsp() + carga;
    }
    
    public int descPotencia(int p){
        return p - (5 * 100 / p);
    }
}
