import java.util.Vector;

public class MSRA
{
    private Vector<Institucion> instituciones = new Vector<Institucion>();
    private Persona responsable;
        
    public void aplicarVacunaSimple(Persona persona, Institucion institucion, Laboratorio laboratorio){
        institucion.addVacuna(new Simple(persona, laboratorio));
    }
    
    public int cantidadVacunasSimpleAplicadas(){
        int t = 0;
        
        for(Institucion i:instituciones) {
            t+=cantidadVacunasSimpleAplicadas();
        }
        
        return t;
    }

    public Vector<Persona> getEnfermeros(){
        Vector<Persona> total = new Vector<Persona>();
        
        for(Institucion i:instituciones) {
            total.addAll(i.getEnfermeros());
        }
        
        return total;
    }
    
    public void addInstitucion(Institucion i) {
        instituciones.add(i);
    }
    
    public void removeInstitucion(Institucion i) {
        instituciones.remove(i);
    }
    
}
