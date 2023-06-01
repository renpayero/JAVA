package Ej3;

public class Chofer {

    private Colectivo colectivo;

    public Colectivo getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }



    public boolean realizarViaje(int cantidadPasajeros, float cantidadKilometros){
        return colectivo.realizarViaje(cantidadPasajeros,cantidadKilometros);}




}
