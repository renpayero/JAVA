/*
 * Recordar que clases abstractas no se instancian (no puedo realizar new ...)
 * Mo puedo realizar new Figura();
 */
public abstract class Figura
{
    //Constantes
    public static final int ROJO = 0;
    public static final int AZUL = 1;
    public static final int AMARILLO = 2;
    //TODO Agregar los colores que crea necesarios.
    
    private int color;
    
    public Figura(int color)
    {
        this.color = color;
    }
    
    public void setColor(int color) {
         this.color = color;
    }
    public int getColor() {
         return color;
    }

    public abstract void pintar();
    
    /*
     * signature: alcance tipo/void nombre_funcion(tipo1 parm1, tipo2 param2,...) 
     */
    public abstract double area();
    
    
}
