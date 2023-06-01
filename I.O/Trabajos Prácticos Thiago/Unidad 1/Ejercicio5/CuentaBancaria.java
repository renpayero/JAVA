
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Date;
public class CuentaBancaria
{
    private int Saldo;
    private Date FechadeCreacion;
    private int Maximo;
    private int Monto;
    private Titular titularcuenta;
    
    public Titular getTitularcuenta(){
        return this.titularcuenta;
    }
    
    public void setTitularcuenta(Titular titularcuenta){
        this.titularcuenta = titularcuenta;
    }
    
    public void Depositar(int Monto){
        Saldo = Saldo + Monto;
    }
    
    public void Extraer(int Monto){
        Saldo = Saldo - Monto;
    }
    
    public int Saldo(){
        return Saldo;
    }

    public void fechacreacion(Date fechaCreacion){
        FechadeCreacion = fechaCreacion;
    }
    
    public int Maximo(){
        return Maximo;
    } 
}
