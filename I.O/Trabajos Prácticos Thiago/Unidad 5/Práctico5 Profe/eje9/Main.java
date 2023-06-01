package eje9;

public class Main {

	public static void main(String[] args) {
		Central c = new Central();
		
		Sensor s1 = new Sensor();
		c.addSensor(s1);
		
		s1 = new Sensor();
		c.addSensor(s1);
		
		s1 = new Sensor();
		c.addSensor(s1);

		c.activar();

		s1.evento();
		
		c.desactivar();
	}

}
