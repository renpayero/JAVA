
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
    private double saldo;
    private String titular;
    private List<Transaccion> transacciones = new ArrayList<Transaccion>();
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public void extraer(double unMonto){
        saldo -= unMonto;
        agregarTransaccion(new Transaccion(new Date(), unMonto, Transaccion.EXT));
    }
    
    public void depositar(double unMonto){
        saldo += unMonto;
        agregarTransaccion(new Transaccion(new Date(), unMonto, Transaccion.DEP));
    }
    
    public void agregarTransaccion(Transaccion unaTransaccion){
        transacciones.add(unaTransaccion);
    }
}
