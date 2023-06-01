import java.util.List;
import java.util.ArrayList;

public class Album
{
    private List<Foto> fotos = new ArrayList<Foto>();
    private String Nombre;
    
    public void agregarFoto(Foto unaFoto){
        fotos.add(unaFoto);
    }
    
    public void agregarFotos(List<Foto> lista) {
        fotos.addAll(lista);
    }
    
    public void eliminarFoto(Foto unaFoto){
        fotos.remove(unaFoto);
    }
    
    public void limpiar(){
        fotos.clear();
    }
    
    public int cantidadFotos(){
        return fotos.size();
    }
}
