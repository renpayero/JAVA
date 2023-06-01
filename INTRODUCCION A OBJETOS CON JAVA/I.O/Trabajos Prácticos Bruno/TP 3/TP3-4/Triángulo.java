
/**
 * Write a description of class Triángulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triángulo extends Figura
{
    private float base;
    private float altura;
    
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
        return (base * altura) / 2;
    }
}
