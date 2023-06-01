
/**
 * Write a description of class Browser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class Browser
{
    private Página actual;
    private List<Página> historial = new ArrayList<Página>();
    private List<String> favoritos = new ArrayList<String>();
    
    public void setActual(Página p){
        actual = p;
    }
    
    public void agregarPáginaHistorial(Página p){
        historial.add(p);
    }
    
    public void eliminarPáginaHistorial(Página p){
        historial.remove(p);
    }
    
    public int contarPaginasHistorial(){
        return historial.size();
    }
    
    public Página retornarUltimaPágina(){
        return historial.get(historial.size() - 1);
    }
    
    public void agregarFavoritos(String uri){
        favoritos.add(uri);
    }
}
