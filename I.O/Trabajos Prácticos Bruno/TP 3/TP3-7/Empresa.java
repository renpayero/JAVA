
/**
 * Write a description of class Empresa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class Empresa
{
    private List<Empleado> empleados = new ArrayList<Empleado>();
    
    public void agregarEmpleado(Empleado unEmpleado){
        empleados.add(unEmpleado);
    }
    
    public void eliminarEmpleado(Empleado unEmpleado){
        empleados.remove(unEmpleado);
    }
    
    public float montoTotal(){
        float t = 0;
        for(Empleado e : empleados){
            t += e.sueldo();
        }
        return t;
    }
}
