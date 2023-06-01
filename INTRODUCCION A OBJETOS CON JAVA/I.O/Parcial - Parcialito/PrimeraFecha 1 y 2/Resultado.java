import java.util.Date;

public class Resultado
{
    private Date fecha;
    private Institucion institucion;
    private boolean positivo;
    private Test test;
    private Estado estado;
     
    public Resultado()
    {
    }
    
    public void setPositivo(boolean positivo) {
        this.positivo = positivo;
    }

    public boolean getPositivo() {
        return positivo;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

     public void setTest(Test test) {
        this.test = test;
    }

    public Test geTest() {
        return test;
    }
    
    public int tiempo() {
        return test.tiempo();
    }
    
    public boolean esSerologico1() {
        return test.esSerologico1();
    }

    public int esSerologico2() {
        return test.esSerologico2();
    }

    public int contarSerologico(int t) {
        return test.contarSerologico(t);
    }

}
