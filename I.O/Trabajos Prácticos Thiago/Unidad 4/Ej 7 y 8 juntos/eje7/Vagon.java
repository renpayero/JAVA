package eje7;

public abstract class Vagon
{
    private int pesoEspecifico;
    
    public Vagon()
    {
    }

    public void setPesoEspecifico(int pesoEspecifico)
    {
        this.pesoEspecifico = pesoEspecifico;
    }
    public int getPesoEspecifico()
    {
        return pesoEspecifico;
    }

    public abstract int getPesoTotal();
    
    public abstract int getCantPasajeros();
    
    public abstract float disminuirVelocidad(float velocidad);
}
