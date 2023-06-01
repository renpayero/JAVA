
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Date;

public class Libro
{
    private String nombre;
    private Date fechaPublicacion;
    private int cantidadDeCopias;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setFechaPublicacion(Date fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }
    
    public Date getFechaPublicacion(){
        return this.fechaPublicacion;
    }
    
    public void setCantidadDeCopias(int cantidadDeCopias){
        this.cantidadDeCopias = cantidadDeCopias;
    }
    
    public int getCantidadDeCopias(){
        return this.cantidadDeCopias;
    }
}
