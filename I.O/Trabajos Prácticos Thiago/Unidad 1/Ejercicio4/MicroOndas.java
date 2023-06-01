
/**
 * Write a description of class MicroOndas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MicroOndas
{
    private static final int MEDIA = 1;
    private static final int PARAR = 0;
    private static final int CALENTADO = 2;
    
    private boolean puertita;
    private int caliente;
    
    public void abrirPuerta(){
       puertita = true;
    }
    
    public void calentar(){
        caliente = CALENTADO;
    }
    
    public void mediaCoccion(){
        caliente = MEDIA;
    }
    
    public void parar(){
        caliente  = PARAR;
    }
    
    public void cerrarPuerta(){
        puertita = false;
    }
        
}
