import java.util.*;
public class Institucion
{
    private List<Resultado> resultados=new ArrayList<Resultado>();
    private List<Tecnico> tecnicos=new ArrayList<Tecnico>();
    private Localidad localidad;
    
    public void setLocalidad(Localidad localidad){
        this.localidad=localidad;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    
    public void addTecnico(Tecnico tecnico){
        tecnicos.add(tecnico);
    }
    public void removeTecnico(Tecnico tecnico){
        tecnicos.remove(tecnico);
    }
    public void addResultado(Resultado resultado){
        resultados.add(resultado);
    }
    public void removeResultado(Resultado resultado){
        resultados.remove(resultado);
    }
}
