
/**
 * Write a description of class Pila here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class Pila
{
    private List<Object> pila = new ArrayList<Object>();
    
    public void apilar(Object unObjeto){
        pila.add(unObjeto);
    }
    
    public void desapilar(){
        for(Object o : pila){
            pila.remove(o);
        }
    }
    
    public Object top(){
        return pila.get(pila.size() - 1);
    }
    
    public Object pop(){
        Object desapilado = pila.get(pila.size() - 1);
        pila.remove(pila.size() - 1);
        return desapilado;
    }
    
    public int size(){
        return pila.size();
    }
    
    public boolean isEmpty(){
        return pila.size() == 0;
    }
}
