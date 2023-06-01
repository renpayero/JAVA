
public class Debito extends Venta
{
  private Usuario user;
  private float precio; 

   public void setPrecio(float precio){
       this.precio=precio;}
       
    public float getMonto(){
        return precio+0.0f-user.getDescuento();}
}
