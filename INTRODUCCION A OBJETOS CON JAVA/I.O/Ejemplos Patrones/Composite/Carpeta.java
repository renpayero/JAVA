import java.util.ArrayList;
import java.util.List;

public class Carpeta extends Nodo
{
    List<Nodo> nodos = new ArrayList<Nodo>();

    public Carpeta( String nombre )
    {
        this.setTipoNodo( Nodo.CARPETA );
        this.setNombre( nombre );
    }
    public void insertarNodo( Nodo nodo )
    {
        nodos.add( nodo );
    }
    public void eliminarNodo( Nodo nodo )
    {
        nodos.remove( nodo );
    }
    public List<Nodo> getNodos()
    {
        return nodos;
    }
    public Nodo getNodo( int posicion )
    {
        return nodos.get( posicion );
    }
    @Override
    public void mostrar()
    {
        System.out.println( "Listando carpeta [" + this.getNombre() + "]" );

        for (Nodo nodo : nodos)
        {
            nodo.mostrar();
        }
    }
}