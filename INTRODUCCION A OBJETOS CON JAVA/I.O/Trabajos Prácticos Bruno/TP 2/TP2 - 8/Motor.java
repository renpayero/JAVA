
/**
 * Write a description of class Motor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Motor
{
    private String marca;
    private String modelo;
    private float precio;
    
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
    
    public void setPrecio(float precio){
        this.precio = precio;
    }
    
    public float getPrecio(){
        return precio;
    }
}
