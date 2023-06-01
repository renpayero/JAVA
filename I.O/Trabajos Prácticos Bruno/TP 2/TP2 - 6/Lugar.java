
/**
 * Write a description of class Lugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lugar
{
    private String pais;
    private String provincia;
    private String ciudad;
    private String direccion;
    private int numero;
    
    public void setPais(String pais){
        this.pais = pais;
    }
    
    public String getPais(){
        return pais;
    }
    
    public void setProvincia(String provincia){
        this.provincia = provincia;
    }
    
    public String getProvincia(){
        return provincia;
    }
    
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
}
