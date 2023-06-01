import java.util.Date;
import java.util.ArrayList;

public class Venta
{

    private Usuario user;
    private Date fecha;
    private float precio;
    private ArrayList<Juego> juegos= new ArrayList<Juego>();
    private int monto;
    private medioDePago medioDePago;
    
    private void setMedioDePago(medioDePago medioDePago){
        this.medioDePago=medioDePago;
    }
    
    private medioDePago getMedioDePago(){
        return this.medioDePago;
    }

    public Usuario getUser(){
        return this.user;
    }

    public void setUser(Usuario user){
        this.user = user;
    }

    public Date getFecha(){
        return this.fecha;
    }

    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public float getPrecio(){
        return this.precio;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public java.util.ArrayList<Juego> getJuegos(){
        return this.juegos;
    }

    public void setJuegos(Juego juegos){
       this.juegos.add(juegos);
    }
    
    public int getMonto(){
        return this.monto;
    }
    
    public void setMonto(int monto){
        this.monto = monto;
    }

}