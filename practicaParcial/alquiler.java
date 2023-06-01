import java.util.Date;
public class alquiler
{
    private Date fechaAlquiler;
    private peliculas pelicula;
    private double monto;
    private boolean devuelta;
    private socios socio;
    
    public void setPelicula(peliculas pelicula){
        this.pelicula=pelicula;
    }
    public void setSocios(socios socio){
        this.socio=socio;
    }
    public void setMonto(double monto){
        this.monto=monto;
    }
    public double getMonto(){
        return monto;
    }
    public void setDevuelta(boolean devuelta){
        this.devuelta=devuelta;
    }
    public boolean getDevuelta(){
        return devuelta;
    }
    

}
