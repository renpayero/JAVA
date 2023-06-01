package Ej2;

public class Chofer implements Frecuencia{
    private Vehiculo vehiculo;

    public Chofer(Vehiculo vehiculo) {
        super();
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo colectivo) {
        this.vehiculo = colectivo;
    }

    public boolean realizarViaje(int cantPas, float cantKmts) {
        return vehiculo.realizarViaje(cantPas, cantKmts);
    }

    public int kilometraje() {
        return vehiculo.getKmts();
    }

    public float getMillas() {
        return vehiculo.getMillas();
    }

    public Date getFechaUltimoViaje() {
        return vehiculo.getFechaUltimoViaje();
    }

}
