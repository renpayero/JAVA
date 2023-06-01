/**
 * Abstract class Vehiculo - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Vehiculo
{
   private String marca;
   private String modelo;
   
   public void setMarca(String marca){
       this.marca = marca;
    }
    
   public String getMarca(){
       return this.marca;
   }
    
   public void setModelo(String modelo){
       this.modelo = modelo;
   }
    
   public String getModelo(){
       return this.modelo;
   }
   
   public abstract double montoAlquilerDe();
   
   public abstract double getPrecioVehiculo();
}
