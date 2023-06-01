package eje7;


public class Pasajero extends Vagon
{
    private static final int PESO_PASAJERO = 80;
    
    private int cantPasajeros;
    
    public Pasajero()
    {
    }

    public void setCantPasajeros(int cantidad)
    {
        cantPasajeros = cantidad;
    }
    public int getCantPasajeros()
    {
        return cantPasajeros;
    }

    public int getPesoTotal() {
        return getPesoEspecifico() + PESO_PASAJERO * cantPasajeros;
    }
    
    public float disminuirVelocidad(float velocidad){
        return velocidad - (velocidad * 0.03f);
    }
}
