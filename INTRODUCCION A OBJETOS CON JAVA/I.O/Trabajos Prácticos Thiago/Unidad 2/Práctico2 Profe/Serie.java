import java.util.List;
import java.util.ArrayList;

public class Serie extends Filme
{
    private List<Capitulo> capitulos = new ArrayList<Capitulo>();

    public Serie()
    {
    }
    
    public void addCapitulo(Capitulo c) {
        capitulos.add(c);
    }

    public void removeCapitulo(Capitulo c) {
        capitulos.remove(c);
    }

    public int cantidadCapitulos() {
        return capitulos.size();
    }
}
