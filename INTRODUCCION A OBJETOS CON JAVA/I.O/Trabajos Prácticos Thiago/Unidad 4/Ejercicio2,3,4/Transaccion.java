public class Transaccion
{
    private java.util.Date Fecha;
    private double Monto;
    private int Tipo;
    private static final int DEP = 0;
    private static final int EXT = 1;
    
    public Transaccion(java.util.Date F, double M, int T)
    {
        Fecha = F;
        Monto = M;
        Tipo = T;
    }
}
