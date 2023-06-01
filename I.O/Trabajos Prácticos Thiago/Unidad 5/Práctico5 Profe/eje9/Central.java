package eje9;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class Central implements Observador {

	private List<Movimiento> movimientos = new ArrayList<Movimiento>();
	private List<Sensor> sensores = new ArrayList<Sensor>();
	
	@Override
	public void actualizar(Sujeto sujeto) {
		addMovimiento((Sensor)sujeto);
	}

	private void addMovimiento(Sensor s) {
		Movimiento m = new Movimiento();
		
		m.setSensor(s);
		m.setFecha(GregorianCalendar.getInstance().getTime());
		
		s.setEstado(Sensor.ESTADO_ESPERANDO);
		
		movimientos.add(m);
	}
	
	public Iterator<Movimiento> getMovimientos() {
		return movimientos.iterator();
	}
	
	public void addSensor(Sensor s) {
		sensores.add(s);
		s.suscribir(this);
	}
	
	public void removeSensor(Sensor s) {
		sensores.remove(s);
		s.quitar(this);
	}

	public void activar() {
		for(Sensor s:sensores) {
			s.setEstado(Sensor.ESTADO_ESPERANDO);
		}
	}

	public void desactivar() {
		for(Sensor s:sensores) {
			s.setEstado(Sensor.ESTADO_APAGADO);
		}
	}	
	
}

