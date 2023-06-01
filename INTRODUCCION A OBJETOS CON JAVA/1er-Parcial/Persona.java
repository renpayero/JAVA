import java.util.Vector;

public class Persona
{
    private String dni;
    private String nombre;
    private String apellido;
    
    private Vector<Vacuna> vacunas = new Vector<Vacuna>();
    
    private Vector<Patologia> patologias = new Vector<Patologia>();

    public Persona()
    {
    }
    
    public void addVacuna(Vacuna v) {
        vacunas.add(v);
    }
    
    public void removeVacuna(Vacuna v) {
        vacunas.remove(v);
    }
    
    public void addPatologia(Patologia p) {
        patologias.add(p);
    }

}
