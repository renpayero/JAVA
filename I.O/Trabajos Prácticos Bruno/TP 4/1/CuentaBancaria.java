
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancaria
{
    private double saldo;
    private Persona titular;
    
    public double Extraer(double unMonto){
        saldo -= unMonto;
        return unMonto;
    }
    
    public void Depositar(double unMonto){
        saldo += unMonto;
    }
    
    public double saldo(){
        return saldo;
    }
    
    public String titular(){
        return titular.getNombre() + titular.getApellido();
    }
}
