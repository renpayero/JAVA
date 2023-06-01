
public class Credito extends Venta
{
    private float precio;
    private Usuario user;
    

   public void setPrecio(float precio){
       this.precio=precio;}
        
   public float getMonto(){
       precio=precio+((precio*3)/100)-user.getDescuento();
        return precio;}
    
    
}
