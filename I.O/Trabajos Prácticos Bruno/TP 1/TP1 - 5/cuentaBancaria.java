
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Date;

public class cuentaBancaria
{
    private float saldo;
    private Date fechaCreacion;
    private Titular titular;
    private int maxExt;
    
    
    public void depositar(float monto) {
        saldo += monto;
    }
    
    public void extraer(float monto) {
        saldo -= monto;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    public Date getFechaCreacion () {
        return fechaCreacion;
    }
    
    public int getMaxExtraccion() {
        return maxExt;
    }
    
    public void setTitular(Titular unTitular) {
        titular = unTitular;
    }
}
