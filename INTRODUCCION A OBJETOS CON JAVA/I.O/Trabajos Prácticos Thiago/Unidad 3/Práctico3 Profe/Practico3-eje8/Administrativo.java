public class Administrativo extends Rol
{
    private int categoria;
    
    public Administrativo(int categoria)
    {
        this.categoria = categoria;
    }
    
    public double calcularSalario(Empleado e) {
        return e.antiguedad() * categoria;
    }
    
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    public int getCategoria() {
        return this.categoria;
    }

}
