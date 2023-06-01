import java.util.Date;
import java.util.Calendar;

public class Empleado extends Persona
{
    private int id;
    
    private Rol rol;
    private String titulo;
    private Date fechaIngreso;
    
    public Empleado(int id, Rol rol)
    {
        this.id = id;
        this.rol = rol;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public Rol getRol() {
        return this.rol;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }


    public double calcularSalario() {
        return rol.calcularSalario(this); 
    }
    
    public int antiguedad() {
        long ingreso = fechaIngreso.getTime();
        long hoy  = Calendar.getInstance().getTime().getTime();
        
        return (int)(hoy - ingreso)/86400000;
    }
}
