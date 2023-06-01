import java.util.ArrayList;
public class institucion
{
    private ArrayList<persona> enfermeros=new ArrayList<persona>();
    private localidad localidad;
    private ArrayList<persona> vacunados=new ArrayList<persona>(); //persona o persona vacunadas
    private ArrayList<vacuna> vacunasAplicadas=new ArrayList<vacuna>();//vacunas en cuestion aplicadas
    
    public void setEnfermeros(persona enfermeros){
        this.enfermeros.add(enfermeros);
    }
    public ArrayList<persona> getEnfermeros(){
        return enfermeros;
    }
    public void setLocalidad(localidad localidad){
        this.localidad=localidad;
    }
    public localidad getLocalidad(localidad localiadad){
        return localidad;
    }
    public void agregarVacunaAplicada(vacuna vacunasAplicadas){
        this.vacunasAplicadas.add(vacunasAplicadas);
    }
}

