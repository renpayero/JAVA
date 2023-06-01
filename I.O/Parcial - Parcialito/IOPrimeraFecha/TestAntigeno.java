import java.util.Date;

public class TestAntigeno extends Test{

    public TestAntigeno(Persona persona, Date fecha) {
        super(persona, fecha);
    }

    @Override
    public double tiempo() {
        return 10;
    }
    
}
