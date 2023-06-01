
public class Credito extends medioDePago
{
    private float recargo=0.3f;
    
    public float recargo(float precio){
        return precio=getPrecio()+getPrecio()*recargo;
    }
}
