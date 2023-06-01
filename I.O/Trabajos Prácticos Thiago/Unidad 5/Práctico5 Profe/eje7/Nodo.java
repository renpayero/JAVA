package eje7;

public abstract class Nodo {

	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void addNodo(Nodo e);
		
	public abstract void removeNodo(Nodo e);
	
	public abstract int getPeso();
	
}
