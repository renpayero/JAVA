package eje7;

public class Diesel extends Locomotora
{
    private static final int CONSUMO = 10;
    
    public Diesel(float velocidadMaxima, int potencia)
    {
        super(velocidadMaxima, potencia);
    }
    
    public int getConsumo() {
        return CONSUMO;
    }
        
}