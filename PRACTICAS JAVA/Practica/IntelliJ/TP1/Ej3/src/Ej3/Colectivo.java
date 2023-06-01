package Ej3;

public class Colectivo {
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    private int cantidadPasajeros;
    private float kilometraje;

    public Colectivo(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
        kilometraje=0;
    }


    public boolean realizarViaje(int cantPasajeros,float km){
        if(cantPasajeros<=this.cantidadPasajeros){
            kilometraje=km;
            return true;
        }
        return false;
    }
}
