public class nacionales extends peliculas
{
    private static float descuento=0.05f;

    public float recargo(float monto){
        return (monto+monto*descuento);}

    public float descuento(float monto){
        return 0;
    }
}
