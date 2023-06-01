
public class Archivo extends Nodo
{
    public Archivo( String nombre )
    {
        this.setTipoNodo( Nodo.ARCHIVO );
        this.setNombre( nombre );
    }
    @Override
    public void mostrar()
    {
        System.out.println( "Archivo: [" + this.getNombre() + "]" );
    }
}