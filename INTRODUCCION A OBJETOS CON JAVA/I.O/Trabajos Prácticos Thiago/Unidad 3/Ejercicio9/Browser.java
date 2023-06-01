import java.util.List;
import java.util.ArrayList;

public class Browser
{
    private List <Pagina> historial = new ArrayList<Pagina>();
    private List<String> favoritos = new ArrayList<String>();
    private Pagina actual;

    public Pagina getPagina(){
        return actual;
    }

    public void setPagina(Pagina actual)
    {
        this.actual = actual;
    }
    
    public void agregarPaginaHistorial(Pagina P){
        historial.add(P);
    }
    
    public void eliminarPaginaHistorial(Pagina P){
        historial.remove(P);
    }
    
    public int PaginasHistorial(){
        return historial.size();
    }
    
    public void agregarFavorito(String F){
        favoritos.add(F);
    }
}
