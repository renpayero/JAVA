
/**
 * Write a description of class Página here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Date;

public class Página
{
    private String direccion;
    private Date fechaVisita;
    private String codigo;
    private int tamanio;
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
        
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setFechaVisita(Date fechaVisita){
        this.fechaVisita = fechaVisita;
    }
    
    public Date getFechaVisita(){
        return this.fechaVisita;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setTamanio(int tamanio){
        this.tamanio = tamanio;
    }
    
    public int getTamanio(){
        return this.tamanio;
    }
}
