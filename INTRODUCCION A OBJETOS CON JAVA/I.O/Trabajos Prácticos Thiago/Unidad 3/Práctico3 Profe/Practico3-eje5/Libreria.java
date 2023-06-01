import java.util.List;
import java.util.ArrayList;

public class Libreria
{
    List<Libro> libros = new ArrayList<Libro>();
    
    public Libreria()
    {
    }
    
    public void agregarLibro(Libro l){
        libros.add(l);
    }
    
    public void borrarLibro(Libro l){
        libros.remove(l);
    }

    public int cantidadLibros() {
        return libros.size();
    }

    public int cantidadTotalDeCopias() {
        int total = 0;
        
        for(Libro l:libros) {
            total += l.getCopias();
        }
        
        return total;
    }
}