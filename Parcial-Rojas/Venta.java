import java.util.Date;

public abstract class Venta
{
    private Usuario user;
    private Date fecha;
    private float precio;
    
    public void setFecha(Date fecha){
        this.fecha=fecha;}
    
    public Date getFecha(){
        return fecha;}
        
    public abstract float getMonto();
    
}
