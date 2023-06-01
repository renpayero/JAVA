
public class CuentaCorriente extends CuentaBancaria
{
    public int maxExt;
    public int cantExt = 0;
    
    public void setMaxExt(int Maximo){
        this.maxExt = Maximo;
    }
    
    public double extraer(double unMonto)
    {
        if(maxExt != cantExt)
            cantExt = cantExt + 1;
            return super.extraer(unMonto);
    }
}
