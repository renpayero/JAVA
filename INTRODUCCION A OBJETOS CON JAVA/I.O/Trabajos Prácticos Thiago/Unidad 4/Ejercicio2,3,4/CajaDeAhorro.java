public class CajaDeAhorro extends CuentaBancaria
{
    public double extraer(double unMonto)
    {
        if(saldo() - unMonto >= 0)
            return super.extraer(unMonto);
       }

}
