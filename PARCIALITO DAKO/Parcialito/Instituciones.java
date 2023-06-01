import java.util.Vector;
public class Instituciones extends MSRA
{
    private String localidad;
    private Vector<Personas> enfermero = new Vector<Personas>();
    
    private void setLocalidad(String localidad){
        this.localidad=localidad;
    }
    private String localidad(){
        return localidad;
    }
    public void agregarEnfermero(String enfermero){
        this.enfermero.add(enfermero);
    }
    
}
