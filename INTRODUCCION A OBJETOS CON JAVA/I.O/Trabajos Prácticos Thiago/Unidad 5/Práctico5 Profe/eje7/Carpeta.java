package eje7;

import java.util.ArrayList;
import java.util.List;

public class Carpeta extends Nodo {

	private List<Nodo> nodos = new ArrayList<Nodo>();
	
	public void addNodo(Nodo e) {
		nodos.add(e);
	}
	
	public void removeNodo(Nodo e) {
		nodos.remove(e);
	}
	
	public int getPeso() {
		int t = 0;
		
		for(Nodo n: nodos)
			t+=n.getPeso();
		
		return t;
	}
	
}
