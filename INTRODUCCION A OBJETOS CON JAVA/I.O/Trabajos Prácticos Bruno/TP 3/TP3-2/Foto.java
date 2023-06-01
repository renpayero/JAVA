
/**
 * Write a description of class Foto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Date;

public class Foto
{
    private String nombre;
    private Date fecha;
    private float tamaño;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    
    public Date getFecha(){
        return this.fecha;
    }
    
    public void setTamaño(float tamaño){
        this.tamaño = tamaño;
    }
    
    public float getTamaño(){
        return this.tamaño;
    }
}
