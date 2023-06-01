
/**
 * Write a description of class EditorFiguras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class EditorFiguras
{
    private List<Figura> figuras = new ArrayList<Figura>();
    
    
    public void pintar(String color){
        for(Figura f : figuras){
            f.pintar(color);
        }
    }
        
    public float calcularArea(){
        float total = 0;
        for(Figura f : figuras){
            total += f.getArea();
        }
        return total;
    }
}