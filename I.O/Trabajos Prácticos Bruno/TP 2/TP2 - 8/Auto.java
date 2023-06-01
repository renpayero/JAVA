
/**
 * Write a description of class Auto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auto
{
    private String marca;
    private String modelo;
    private String patente;
    private float precioTotal;
    private Motor motor;
    private Puerta puerta;
    private Rueda rueda;
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setPatente(String patente){
        this.patente = patente;
    }
    
    public String getPatente(){
        return patente;
    }
    
    public void setPrecio(Motor motor){
        precioTotal = motor.getPrecio() + puerta.getPrecio() + rueda.getPrecio();
    }
}
