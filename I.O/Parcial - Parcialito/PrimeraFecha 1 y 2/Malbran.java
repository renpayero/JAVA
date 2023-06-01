import java.util.Vector;

public class Malbran
{
    private Vector<Institucion> instituciones = new Vector<Institucion>();
    private Vector<Resultado> resultados = new Vector<Resultado>();
    private Director director;
    
    public Malbran()
    {
    }
    
    public void agregarInstitucion(Institucion institucion) {
        if(!instituciones.contains(institucion))
             instituciones.add(institucion);
    }

    public void borrarInstitucion(Institucion institucion) {
        instituciones.remove(institucion);
    }
    
    public void agregarResultadoPositivo(Test test, Institucion institucion) {
        //Resultado r = new Resultado(test, institucion, true); OTRA SOLUCIÓN VALIDA
        Resultado r = new Resultado();
        
        r.setInstitucion(institucion);
        r.setPositivo(true);
        r.setTest(test);
        
        institucion.addResultado(r);
        
        agregarInstitucion(institucion);
        
        //OLVIDARON
        resultados.add(r);
    }

    public int tiempoTotalMinutos() {
        int t = 0;
        
        for(Resultado r:resultados) {
            //t+=r.getTest().tiempo(); //ROMPE Encapsulamiento
            t+=r.tiempo();
        }
        
        return t;
    }
    
    //SOLUCIONES CONSIDERADAS.
    public int totalSerologicos1() {
         int t = 0;
        
        for(Resultado r:resultados) {
            //if(r.esSerologico()==true) NO es necesario comparar.
            //if(r.gestTest().esSerologico1()) ROMPE Encapsulamiento
            if(r.esSerologico1())
                t++;
        }
        
        return t;
    }
    
    public int totalSerologicos2() {
         int t = 0;
        
        for(Resultado r:resultados) {
            //t+=r.getTest().esSerologico2(); ROMPE Encapsulamiento
            t+=r.esSerologico2();
        }
        
        return t;
    }
    
    //CORRECTA
    public int totalSerologicos3() {
         int t = 0;
        
        for(Resultado r:resultados) {
            //t=r.gestTest().contarSerologico(t); ROMPE Encapsulamiento
            t=r.contarSerologico(t);
        }
        
        return t;
    }
}
