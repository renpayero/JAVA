public class Puerta
{
    private boolean abierto;
    
    public Puerta()
    {
    }
    
    public void abrir() {
        abierto=true;
    }

    public void cerrar() {
        abierto=false;
    }

    public boolean estaAbierta(){
        return abierto;
    }
}
