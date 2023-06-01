package eje5;

public abstract class Vehiculo {

	private String marca;
	private String modelo;
	private float precio; 
	private float precioAlquiler;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getPrecioAlquiler() {
		return precioAlquiler;
	}
	public void setPrecioAlquiler(float precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	public abstract float costoTotalAlquiler();
}
