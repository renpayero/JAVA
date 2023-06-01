import java.util.*;
public class Malbran
{
    private List<Resultado> resultados=new ArrayList <Resultado>();
    private List<Institucion> instituciones=new ArrayList <Institucion>();
    private Director director;
    
    public void setDirector(Director director){
        this.director=director;
    }
    public Director getDirector(){
        return director;
    }
    
    public void addInstitucion(Institucion institucion){
        instituciones.add(institucion);
    }
    public void removeInstitucion(Institucion institucion){
        instituciones.remove(institucion);
    }
    public void addResultado(Resultado resultado){
        resultados.add(resultado);
    }
    public void removeResultado(Resultado resultado){
        resultados.remove(resultado);
    }
    
    public double tiempoTotalMinutos(){
        double t=0.0;
        for(Resultado r: resultados){
            t+=r.tiempoTarda();
        }
        return t/60;
    }
    
    public int getTotalSerologicos(){
        int t=0;
        for (Resultado r: resultados){
            t+=r.serologico();
        }
        return t;
    }
}
