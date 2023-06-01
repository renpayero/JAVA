import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Filme
{
    private String descripcion;
    
    private Date fechaCreacion;
    
    private List<Personaje> personajes = new ArrayList<Personaje>();
    private Director director;
    
    public Filme()
    {
    }
    
    public void addPersonaje(Personaje p) {
        personajes.add(p);
    }

    public void removePersonaje(Personaje p) {
        personajes.remove(p);
    }

    public Director getDirector() {
        return director;
    }
    public void setDirector(Director director) {
       this.director = director;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
       this.descripcion = descripcion;
    }
}
