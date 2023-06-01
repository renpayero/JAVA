package eje7;

import java.util.Vector;

public class Tren
{
    private Vector<Vagon> vagones = new Vector<Vagon>();
    
    private Locomotora locomotora;
        
    public Tren()
    {
    }

    public void setLocomotora(Locomotora locomotora)
    {
        this.locomotora = locomotora;
    }
    public Locomotora getLocomotora()
    {
        return this.locomotora;
    }
   
    public void agregarVagon(Vagon v) {
        vagones.add(v);
    }
    public void borrarVagon(Vagon v) {
        vagones.remove(v);
    }
    
    public int pesoTotalDelTren() {
       return pesoVagones(vagones) + locomotora.getPesoEspecifico();
    }

    private int pesoVagones(Vector<Vagon> misVagones) {
        int pesoVagones = 0;
        
        for(Vagon v:misVagones) {
            pesoVagones+=v.getPesoTotal();
        }
        
        return pesoVagones;
    }

    public boolean puedeMover(Vector<Vagon> otrosVagones) {
        return locomotora.getPotencia() >= pesoVagones(otrosVagones);
    }

    public int cantPasajeros() {
        int cantidad = 0;
        
        for(Vagon v:vagones) {
            cantidad+=v.getCantPasajeros();
        }
        
        return cantidad;
    }

    public float velocidadMaxima() {
        float velocidadActual = locomotora.getVelocidadMaxima();
        
        for(Vagon v: vagones) {
            velocidadActual=v.disminuirVelocidad(velocidadActual);
        }
        
        return velocidadActual;
    }

}
