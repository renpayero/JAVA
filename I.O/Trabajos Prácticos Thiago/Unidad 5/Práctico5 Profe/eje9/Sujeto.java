package eje9;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {

	private List<Observador> observadores = new ArrayList<Observador>();
	
	public void suscribir(Observador o) {
		observadores.add(o);
	}
	
	public void quitar(Observador o) {
		observadores.remove(o);
	}
	
	public void notificar() {
		for(Observador o: observadores)
			o.actualizar(this);
	}
	
}
