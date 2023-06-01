
/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador
{
    private int valor;
    
    public void iniciar(){
        iniciar(0);
    }
    
    public void iniciar(int n){
        valor = n;
    }
    
    public void sumar(){
        valor++;
    }
    
    public void restar(){
        valor--;
    }
    
    public void suma(int n){
        valor += n;
    }
    
    public void restar(int n){
        valor -= n;
    }
}
