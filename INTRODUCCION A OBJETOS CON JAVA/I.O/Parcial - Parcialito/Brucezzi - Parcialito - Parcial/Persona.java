import java.util.*;
public class Persona
{
    private int DNI,nroTelefono;
    private String nombre,apellido,alias,direccion,nacionalidad,estadoCivil; // Etc
    private Date fechaNacimiento;
    
    public void setDNI(int DNI){
        this.DNI=DNI;
    }
    public int getDNI(){
        return DNI;
    }
    
    public void setNroTelefono(int nroTelefono){
        this.nroTelefono=nroTelefono;
    }
    public int getNroTelefono(){
        return nroTelefono;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
     }
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
     }
    public String getApellido(){
        return apellido;
    } 
    
       public void setAplias(String alias){
       this.alias=alias;
    }
    public String getAlias(){
        return alias;
    }
    
       public void setDireccion(String direccion){
       this.direccion=direccion;
    }
    public String getDireccion(){
        return direccion;
    } 
    
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad=nacionalidad;
    }
    public String getNacionalidad(){
        return nacionalidad;
    } 
    
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil=estadoCivil;
    }
    public String getEstadoCivil(){
        return estadoCivil;
    } 
    
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    } 
}
