
/**
 * Write a description of class Pasajero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pasajero extends Vagon
{
   private int cantPas;
   
   public void setCantPas(int p){
       this.cantPas = p;
   }
    
   public int getCantPas(){
       return cantPas;
   }
    
   public int getPeso(){
       return getPesoEsp() + 80 * cantPas;
   }
   
   public int descPotencia(int p){
       return p - (3 * 100 / p);
    }
}
