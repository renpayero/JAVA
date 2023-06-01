import java.util.List;
import java.util.ArrayList;

/**
 * Uso:
 * 
 * Empresa e = new Empresa();
 * 
 * Tecnico rol1 = new Tecnico(220.00);
 * Empleado e1 = new Empleado(1, rol1);
 * e1.setNombre("nelson");
 * e,agregarEmpleado(e1);
 * 
 * Administrativo rol2 = new Administrativo(2);
 * Empleado e2 = new Empleado(2, rol2);
 * e2.setNombre("David");
 * e,agregarEmpleado(e2);
 * 
 * e.montoTotal();
 */
public class Empresa
{
    private List<Empleado> empleados = new ArrayList<Empleado>();
    
    //TODO Agregar atributos que consideren.
     
    public Empresa()
    {
    }
    
    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }
    
    public void borrarEmpleado(Empleado e){
        empleados.remove(e);
    }

    public double montoTotal() {
        double total = 0;
        
        for(Empleado e:empleados) {
            total+=e.calcularSalario();
        }
        
        return total;
    }
 
}
