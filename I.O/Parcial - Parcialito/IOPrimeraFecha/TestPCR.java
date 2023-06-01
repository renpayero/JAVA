import java.util.Date;

public class TestPCR extends Test {

	public TestPCR(Persona persona, Date fecha) {
		super(persona, fecha);
	}

	@Override
	public double tiempo() {
		return 120;
	}
	
}
