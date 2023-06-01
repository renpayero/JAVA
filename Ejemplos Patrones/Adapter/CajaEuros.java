
public class CajaEuros
{
    private double euros=0;
    public CajaEuros() {
    }
    public double getTotalEuros()
    {
        return this.euros;
    }
    public void sacarEuros(double euros)
    {
        this.euros-=euros;
    }
    public void ingresarEuros(double euros)
    {
        this.euros+=euros;
    }
}