
/**
 * Write a description of class Cita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Date;

public class Cita
{
    private Date fecha;
    private int importancia; /** Valor del 1 al 5 **/
    private Persona contacto;
    private Lugar lugar;
    
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public void setImportancia(int importancia){
        this.importancia = importancia;
    }
    
    public int getImportancia(){
        return importancia;
    }
    
    public void setPersona(Persona contacto){
        this.contacto = contacto;
    }
    
    public Persona getContacto(){
        return contacto;
    }
    
    public void setLugar(Lugar lugar){
        this.lugar = lugar;
    }
    
    public Lugar getLugar(){
        return lugar;
    }
}
