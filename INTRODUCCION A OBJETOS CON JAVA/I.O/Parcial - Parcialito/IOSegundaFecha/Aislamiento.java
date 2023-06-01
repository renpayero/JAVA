public class Aislamiento extends Centro{

	public Aislamiento(Localidad localidad, String nombre) {
		super(localidad, nombre);
	}
	
	public int sumarAislamiento(int sum) {
		return sum+1;
	}

	@Override
	public int cantidadDeMedicos() {
		return 0;
	}

}
