/**
 * Abstract class Locomotora - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Locomotora
{
    private int peso;
    private int potencia;
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    
    public int getPotencia(){
        return potencia;
    }
    
    public abstract int cantLitrosNecesarios(int km);
}
