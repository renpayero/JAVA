 

public abstract class Locomotora
{
    private float velocidadMaxima;
    private int potencia;
    private int pesoEspecifico;
    
    public Locomotora(float velocidadMaxima, int potencia)
    {
        this.setVelocidadMaxima(velocidadMaxima);
        this.setPotencia(potencia); 
    }
    
    public void setPotencia(int potencia) {
        this.potencia = potencia; 
    }
    public int getPotencia() {
        return this.potencia;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima; 
    }
    public float getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    
    public void setPesoEspecifico(int pesoEspecifico)
    {
        this.pesoEspecifico = pesoEspecifico;
    }
    public int getPesoEspecifico()
    {
        return pesoEspecifico;
    }
    
    public int cantidadDeLitrosNecesarios(int km) {
        return km * getConsumo();
    }
    
    public abstract int getConsumo();
}