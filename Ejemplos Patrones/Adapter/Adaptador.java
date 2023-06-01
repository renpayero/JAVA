
public class Adaptador implements IAdaptador
{
    CajaEuros cajaEuros=new CajaEuros();
    public Adaptador() {
    }
    public double getSaldo()
    {
        return this.cajaEuros.getTotalEuros();
    }
    @Override
    public void sacarPesos(double pesos)
    {
        double euros=pesos/86.63;
        cajaEuros.sacarEuros(euros);
    }
    @Override
    public void ingresarPesos(double pesos)
    {
        double euros=pesos/86.63;
        cajaEuros.ingresarEuros(euros);
    }
}