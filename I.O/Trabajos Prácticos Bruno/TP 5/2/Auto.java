
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
    private double valuacion;
    
    public Auto(String ma, String mo, double valuacion){
        this.setMarca(ma);
        this.setModelo(mo);
        this.setValuacion(valuacion);
    }
    
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
    
    public void setValuacion(double valuacion){
        this.valuacion = valuacion;
    }
    
    public double getValuacion(){
        return valuacion;
    }
}
