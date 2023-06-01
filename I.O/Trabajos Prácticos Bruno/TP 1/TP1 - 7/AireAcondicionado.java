
/**
 * Write a description of class AireAcondicionado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AireAcondicionado
{
    private static final int SUBIR = 1;
    private static final int BAJAR = 0;
    
    private boolean prendido;
    private int temperatura;
    
    public void encender (){
        prendido = true;
    }
    
    public void apagar (){
        prendido = false;
    }
    
    public void subirTemperatura (){
        temperatura = SUBIR;
    }
    
    public void bajarTemperatura (){
        temperatura = BAJAR;
    }
}
