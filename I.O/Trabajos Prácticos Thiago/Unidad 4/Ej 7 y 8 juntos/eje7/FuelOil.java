package eje7;

public class FuelOil extends Locomotora
{
    private static final int CONSUMO = 15;
    
    public FuelOil(float velocidadMaxima, int potencia)
    {
        super(velocidadMaxima, potencia);
    }
    
    public int getConsumo() {
        return CONSUMO;
    }
        
}