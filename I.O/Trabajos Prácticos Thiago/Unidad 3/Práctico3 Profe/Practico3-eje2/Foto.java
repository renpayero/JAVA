import java.util.Date;

public class Foto
{
    //Constantes
    public static int RES_1024_X_768 = 0;
    public static int RES_1600_x_1200 = 1;
    public static int RES_x_1536 = 2;
    public static int RES_2592_x_1944 = 3;
    //Foto.RES_1024_X_768
    
    public static int TIPO_PUBLICITARIA = 0;
    public static int TIPO_MODA = 1;
    public static int TIPO_DOCUMENTAL = 2;
    public static int TIPP_PAISAJISTA = 3;
    public static int TIPP_CIENTIFICA = 4;
    //Foto.TIPO_PUBLICITARIA
    
    public static int FORMATO_JPG = 0;
    public static int FORMATO_JPNG = 1;
    public static int FORMATO_GIF = 2;
    //Foto.FORMATO_JPG
    
    private Date fecha;
    private String descripcion;
    private int tipo;
    private int resolucion;
    private int formato;
    //TODO Agregar los atributos que consideren
    
    //Ejemplo de uso:
    //Foto f = new Foto("Mi Foto");
    //f.setFormato(Foto.FORMATO_JPG);
    //f.setResolucion(Foto.RES_1024_X_768);
    
    //Constructores
    public Foto(String descripcion)
    {
           this.descripcion = descripcion;
    }

    public Foto(Date fecha, String descripcion)
    {
           this.fecha = fecha;
           this.descripcion = descripcion;
    }
    
    public Foto(String descripcion, int tipo, int resolucion)
    {
           this.descripcion = descripcion;
           this.tipo = tipo;
           this.resolucion = resolucion;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getFecha() {
        return fecha;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public int getTipo() {
        return tipo;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
    public int getResolucion() {
        return resolucion;
    }

    public void setFormato(int formato) {
        this.formato = formato;
    }
    public int getformato() {
        return formato;
    }

    //Agregar los getters/setters que consideren
}
