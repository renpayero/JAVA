
/**
 * Write a description of class Microonda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Microonda
{
    private static final int MEDIA = 1;
    private static final int NORMAL = 0;
    
    private boolean abrir;
    private boolean cocinar;
    private int tipo;
    
    public void abrirPuerta () {
        abrir = true;
    }
    
    public void cerrarPuerta () {
        abrir = false;
    }
    
    public void cocinar () {
        cocinar = true;
    }
    
    public void pararCocinar () {
        cocinar = false;
    }
    
    public  void cocinarMediaPotencia () {
        tipo = MEDIA;
    }
    
    public void cocinarNormal () {
        tipo = NORMAL;
    }
}
