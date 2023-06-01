import java.util.Vector;

public class Institucion
{
    private Vector<Persona> enfermeros = new Vector<Persona>();
    
    private Vector<Vacuna> vacunas = new Vector<Vacuna>();
    
    private Localidad localidad;
    
    public Institucion()
    {
    }

    public void addVacuna(Vacuna v) {
        vacunas.add(v);
    }
    
    public int cantidadVacunasSimpleAplicadas(){
        int t = 0;
        
        for(Vacuna v: vacunas) {
            t+=v.cantidadVacunasSimpleAplicadas();
        }
        
        return t;
    }

    public void addEnfermero(Persona p) {
        enfermeros.add(p);
    }
    
    public int cantEnfermeros() {
        return enfermeros.size();
    }
    
    public Vector<Persona> getEnfermeros() {
        return enfermeros;
    }
    
}
