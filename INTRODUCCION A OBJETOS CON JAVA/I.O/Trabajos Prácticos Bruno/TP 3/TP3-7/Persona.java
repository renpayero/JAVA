
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Date;

public class Persona
{
    private String nombre;
    private double dni;
    private String direccion;
    private Date fechaNacimiento;
    private String sexo;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setDni(double dni){
        this.dni = dni;
    }
    
    public double getDni(){
        return this.dni;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Date setFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getSexo(){
        return this.sexo;
    }
}
