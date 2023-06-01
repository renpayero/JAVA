import java.util.Date;

public class Resultado {

    private Test test;
    private Institucion institucion;
    private Date fecha;
    private boolean positivo;

    public Resultado(Test test, Institucion institucion, boolean positivo) {
        setTest(test);
        setInstitucion(institucion);
        setFecha(new Date());
        setPositivo(positivo);
    }

    public boolean isPositivo() {
        return positivo;
    }

    public void setPositivo(boolean positivo) {
        this.positivo = positivo;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public double getTiempo() {
    	return getTest().tiempo();
    }
    
    public int getTotalSerologicos(int valor) {
    	return getTest().sumarSerologico(valor);
    }
}
