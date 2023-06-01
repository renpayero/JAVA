import java.util.Vector;
import java.util.Date;
abstract class peliculas
{
    private String titulo;
    private Vector<String> actores=new Vector<String>();
    private Date añoEstreno;
    private int duracion;
    private int cantVecesAlquiladas;
    
    public abstract float descuento(float monto);
    public abstract float recargo(float monto);
    public void setCantVecesAlquiladas(int cantVecesAlquiladas){
        this.cantVecesAlquiladas=cantVecesAlquiladas;
    }
    public int getCantVecesAlquiladas(){
        return cantVecesAlquiladas;
    }
    
}
