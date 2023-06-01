
/**
 * Write a description of class Transacción here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Date;

public class Transaccion
{
    private Date fecha;
    private double monto;
    private int tipo;
    public static int DEP = 0;
    public static int EXT = 1;
    
    public void transaccion(Date unaFecha, double unMonto, int tipo){
        this.fecha = fecha;
        this.monto = monto;
        this.tipo = tipo;
    }
}
