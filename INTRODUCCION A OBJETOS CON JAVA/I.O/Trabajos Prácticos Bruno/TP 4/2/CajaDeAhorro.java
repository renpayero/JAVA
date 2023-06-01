
/**
 * Write a description of class CajaDeAhorro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CajaDeAhorro extends CuentaBancaria
{
    public double extraer(double unMonto){
        if(saldo() - unMonto >= 0){
            return super.extraer(unMonto);
        }
        else{
            return 0;
        }
    }
}
