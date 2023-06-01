public class Tecnico extends Rol
{
    private double monto;
    
    public Tecnico(double monto)
    {
        this.monto = monto;
    }
    
    public double calcularSalario(Empleado e) {
        return monto;
    }
    
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public double getMonto() {
        return this.monto;
    }
}
