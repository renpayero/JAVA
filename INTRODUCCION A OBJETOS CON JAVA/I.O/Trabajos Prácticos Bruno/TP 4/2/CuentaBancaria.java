
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class CuentaBancaria
{
    private List<Transaccion> transacciones = new ArrayList<Transaccion>();
    private double saldo;
    private Persona titular;
    
    public double extraer(double unMonto){
        saldo -= unMonto;
        agregarTransaccion(new Transaccion(new Date(unaFecha), unMonto, Transaccion.EXT));
        return unMonto;
    }
    
    public void depositar(double unMonto){
        saldo += unMonto;
        agregarTransaccion(new Transaccion(new Date(unaFecha), unMonto, Transaccion.DEP));
    }
    
    public double saldo(){
        return saldo;
    }
    
    public String titular(){
        return titular.getNombre() + titular.getApellido();
    }
    
    public void agregarTransaccion(Transaccion unaTransaccion){
        transacciones.add(unaTransaccion);
    }
}
