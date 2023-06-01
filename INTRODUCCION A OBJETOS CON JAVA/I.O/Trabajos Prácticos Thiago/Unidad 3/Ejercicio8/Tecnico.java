public class Tecnico extends Empleado
{
    private float montoContrato;

    public void setMontoContrato (float montoContrato){
        this.montoContrato = montoContrato;
    }
    
    public float sueldo()
    {
        return montoContrato;
    }
}
