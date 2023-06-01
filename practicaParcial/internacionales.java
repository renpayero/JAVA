public class internacionales extends peliculas
{

    private static float RECARGO=0.01f;

    public float recargo(float monto){
        return (monto+monto*RECARGO);}

    public float descuento(float monto){
        return 0;
    }
}