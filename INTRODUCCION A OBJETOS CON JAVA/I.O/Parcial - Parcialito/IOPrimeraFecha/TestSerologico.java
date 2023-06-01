import java.util.Date;

public class TestSerologico extends Test{

    private Muestra muestra;
    
    public TestSerologico(Persona persona, Date fecha, Muestra muestra) {
        super(persona, fecha);
        this.setMuestra(muestra);
    }

    @Override
    public double tiempo() {
        return 15;
    }

    public Muestra getMuestra() {
        return muestra;
    }

    public void setMuestra(Muestra muestra) {
        this.muestra = muestra;
    }
    
    @Override
    public int sumarSerologico(int valor) {
        return valor + 1;
    }
    
}
