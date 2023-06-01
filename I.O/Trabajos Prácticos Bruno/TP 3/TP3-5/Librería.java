
/**
 * Write a description of class Librería here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class Librería
{
    private String nombre;
    private List<Libro> coleccion = new ArrayList<Libro>();
    
    public void agregarLibro(Libro unLibro){
        coleccion.add(unLibro);
    }
    
    public void eliminarLibro(Libro unLibro){
        coleccion.remove(unLibro);
    }
    
    public int cantidadDeLibros(){
        return coleccion.size();
    }
    
    public int cantidadTotalDeCopias(){
        int total = 0;
        for(Libro libro : coleccion){
            total += libro.getCantidadDeCopias();
        }
        return total;
    }
}
