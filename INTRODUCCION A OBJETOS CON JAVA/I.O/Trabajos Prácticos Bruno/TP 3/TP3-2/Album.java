
/**
 * Write a description of class Album here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class Album
{
    private String nombre;
    private List<Foto> fotos = new ArrayList<Foto>();
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void agregarFoto(Foto unaFoto){
        fotos.add(unaFoto);
    }
    
    public void agregarFotos(List<Foto> lista){
        fotos.addAll(lista);
    }
    
    public void eliminar(Foto unaFoto){
        fotos.remove(unaFoto);
    }
    
    public void limpiar(){
        fotos.clear();
    }
    
    public int cantFotos(){
        return fotos.size();
    }
}
