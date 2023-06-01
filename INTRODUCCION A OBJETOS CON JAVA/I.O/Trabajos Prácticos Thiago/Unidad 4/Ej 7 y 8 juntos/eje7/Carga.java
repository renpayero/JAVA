package eje7;


public class Carga extends Vagon
{
    private int pesoCarga;
    
    public Carga()
    {
    }

    public void setPesoCarga(int carga)
    {
        this.pesoCarga = carga;
    }
    public int getPesoCarga()
    {
        return pesoCarga;
    }
    
    public int getPesoTotal() {
        return getPesoEspecifico() + pesoCarga;
    }
    
    public int getCantPasajeros() {
        return 0;
    }
    
    public float disminuirVelocidad(float velocidad){
        return velocidad - (velocidad * 0.05f);
    }
}
