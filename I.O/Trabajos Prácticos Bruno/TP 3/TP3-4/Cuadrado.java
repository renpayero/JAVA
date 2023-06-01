
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Figura
{
    private int lados;
    private float base;
    private float altura;
    
    public void setLados(int lados){
        this.lados = lados;
    }
    
    public int getLados(){
        return lados;
    }
    
    public void setBase(float base){
        this.base = base;
    }
    
    public float getBase(float base){
        return base;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getArea(){
        return base * altura;
    }
}
