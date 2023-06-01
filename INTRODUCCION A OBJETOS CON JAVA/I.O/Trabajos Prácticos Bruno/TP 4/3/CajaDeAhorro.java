
/**
 * Write a description of class CajaDeAhorro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CajaDeAhorro extends CuentaBancaria
{
    public void extraer(double unMonto){
        if(super.getSaldo() - unMonto >= 0){
            super.extraer(unMonto);
        }
    }
}
