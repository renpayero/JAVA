import java.util.List;
import java.util.ArrayList;

public class CuentaBancaria
{
    private double Monto;
    private Persona Titular;
    private List<Transaccion> Transacciones = new ArrayList<Transaccion>();
    private Moneda Tipo;

    public void extraer(double unMonto)
    {
        Monto = Monto - unMonto;
        agregarTransaccion(new Transaccion(new java.util.Date(), unMonto, EXT));
    }
    
    public void depositar(double unMonto)
    {
        Monto = Monto + unMonto;
        agregarTransaccion(new Transaccion(new java.util.Date(), unMonto, DEP));
    }
    
    public double saldo()
    {
        return Monto * Moneda.valorConv();
    }
    
    public Persona getTitular(){
        return Titular;
    }
    
    public void setTitular (Persona unTitular)
    {
        this.Titular = unTitular;
    }
    
    public void setMoneda (Moneda unaMoneda)
    {
        this.Tipo = unaMoneda;
    }
    
    public void agregarTransaccion(Transaccion unaTransaccion)
    {
        Transacciones.add(unaTransaccion);
    }
}
