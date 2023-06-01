import java.util.List;
import java.util.ArrayList;

public class Album
{
    private List<Foto> fotos = new ArrayList<Foto>();
    //private ArrayList<Foto> fotos = new ArrayList<Foto>();
    //TODO Agregar atributos que consideren
    
    //Constructor defecto
    public Album()
    {
    }

    public void agregarFoto(Foto foto){
       fotos.add(foto);
    }
    
    public void borrarFoto(Foto foto){
        fotos.remove(foto);
    }

    public void borrarFotos(){
        fotos.clear();
    }

    /**
     * Uso:
     * Album a = new Album();
     * a.setDescripcion("Mi Album");
     * 
     * List<Foto> anexos = new ArrayList<Foto>();
     * 
     * Foto f1 = new Foto("Mi Foto");
     * anexos.add(f1);
     * 
     * Foto f2 = new Foto("Mi Foto");
     * anexos.add(f2);
     * 
     * a.agregarFotos(anexos);
     */
    public void agregarFotos(List<Foto> fotos){
        fotos.addAll(fotos);
    }

    //TODO Agregar las operaciones que consideren
}
