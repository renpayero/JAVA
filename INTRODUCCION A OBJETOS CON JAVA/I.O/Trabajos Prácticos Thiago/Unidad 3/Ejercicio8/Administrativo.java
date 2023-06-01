public class Administrativo extends Empleado
{
    private int anio;
    private int categoria;
    
    public void setAnio (int anio){
        this.anio = anio;
    }

    public void setCategoria (int categoria){
        this.categoria = categoria;
    }
    
    public float sueldo()
    {
        return anio * categoria;
    }
}
