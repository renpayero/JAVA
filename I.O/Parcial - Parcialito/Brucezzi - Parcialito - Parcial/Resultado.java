import java.util.*;
public class Resultado
{
    private Date fechaResultado;
    private Institucion institucion;
    private boolean testPositivoNegativo;  // Si es True + ; Si es False -
    private Test test;
    
    public void setFechaResultado(Date fechaResultado){
        this.fechaResultado=fechaResultado;
    }
    public Date getFechaResultado(){
        return fechaResultado;
    }
    
    public void setInstitucion(Institucion institucion){
        this.institucion=institucion;
    }
    public Institucion getInstitucion(){
        return institucion;
    } 
    
    public void setTestPositivoNegativo(boolean testPositivoNegativo){
        this.testPositivoNegativo=testPositivoNegativo;
    }
    public boolean getTestPositivoNegativo(){
        return testPositivoNegativo;
    }
    
    public void setTest(Test test){
        this.test=test;
    }
    public Test getTest(){
        return test;
    }
    
    public double tiempoTarda(){
        return getTest().calcularTiempo();
    }
    
    public int serologico(){
        return getTest().esSerologico();
    }
}
