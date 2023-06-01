import java.util.Vector;
public class videoClub
{
    private Vector<alquiler> registroAlquileres=new Vector<alquiler>();
    
    public void addRegistroAlquileres(alquiler a){
        registroAlquileres.add(a);
    }
    
    public void alquilar(peliculas unaPelicula, socios unSocio){
        alquiler a=new alquiler();
        a.setPelicula(unaPelicula);
        a.setSocios(unSocio);
        registroAlquileres.add(a);
        
    }
    public double montoTotalDePeliculasAlquiladas(){
        double b=0;
        for(alquiler i:registroAlquileres) {
            b=b+i.getMonto();
        }
        return b;
    }
    public int cantidadDePeliculasNoDevueltas(){
        int c=0;
        for(alquiler i:registroAlquileres) {
            if(i.getDevuelta()==false){
                c+=1;
            }
        }
        return c;
    }
    public peliculas peliculaQueMasVecesSeAlquilo(){
        int d=0;
        for(alquiler i:registroAlquileres) {
            if(i.getCantVecesAlquiladas()>d){
            }
        }
    }
    
}
