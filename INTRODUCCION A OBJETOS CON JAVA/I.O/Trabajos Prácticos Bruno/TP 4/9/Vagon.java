/**
 * Abstract class Vagon - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Vagon
{
    private int pesoEsp;
    
    public void setPesoEsp(int p){
        this.pesoEsp = p;
    }
    
    public int getPesoEsp(){
        return pesoEsp;
    }
    
    public abstract int getCantPas();
    
    public abstract int getPeso();
    
    public abstract int descPotencia(int p);
}
