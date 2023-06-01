package eje7;

public class Electrica extends Locomotora
{
    private static final int CONSUMO = 0;
    
    public Electrica(float velocidadMaxima, int potencia)
    {
        super(velocidadMaxima, potencia);
    }
    
    public int getConsumo() {
        return CONSUMO;
    }
        
}

