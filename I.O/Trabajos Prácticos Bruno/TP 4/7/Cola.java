
/**
 * Write a description of class Cola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class Cola
{
    private List<Object> cola = new ArrayList<Object>();
    
    public void encolar(Object unObjeto){
        cola.add(unObjeto);
    }
    
    public Object desencolar(){
        Object desencolado = cola.get(0);
        cola.remove(0);
        return desencolado;
    }
    
    public boolean isEmpty(){
        return cola.size() == 0;
    }
    
    public int size(){
        return cola.size();
    }
    
    public Object first(){
        return cola.get(0);
    }
    
    public Object last(){
        return cola.get(size() - 1);
    }
}
