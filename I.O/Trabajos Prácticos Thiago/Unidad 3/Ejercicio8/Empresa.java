import java.util.List;
import java.util.ArrayList;

public class Empresa
{
    // instance variables - replace the example below with your own
    private Empleado E;
    private float t;
    private List <Empleado> empleados = new ArrayList<Empleado>();

    public Empleado getE()
    {
        return E;
    }
    
    public void setEmpleado (Empleado E){
        this.E = E;
    }
    
    public float montoTotal(){
        for(Empleado E:empleados)
            t += E.sueldo();
        return t;
    }
    
    public void agregarEmpleado(Empleado E){
        empleados.add(E);
    }
}
