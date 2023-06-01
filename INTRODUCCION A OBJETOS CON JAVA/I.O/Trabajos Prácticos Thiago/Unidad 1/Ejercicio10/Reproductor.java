
/**
 * Write a description of class Reproductor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Reproductor
{
    private boolean reproducirCancion;
    private boolean siguienteAnt;
    private int volumen=10;
    
    public void reproducir(){
        reproducirCancion=true;
    }
    public void pausar(){
        reproducirCancion=false;
    }
    public void siguiente(){
        siguienteAnt=true;
    }
    public void anterior(){
        siguienteAnt=false;
    }
    public void bajarVol(){
        if (volumen > 0){
            volumen-=1;
        }
    }
    public void subirVol(){
        if (volumen < 11){
            volumen+=1;
        }
    }
}
