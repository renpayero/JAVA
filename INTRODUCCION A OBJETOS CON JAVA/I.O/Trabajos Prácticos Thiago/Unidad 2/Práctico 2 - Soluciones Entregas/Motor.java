public class Motor
{
    private boolean encendido;
    
    private String marca;
    private int potencia;
    
    //TODO Agregar el resto de los atributos que representan al Motor
    
    public Motor()
    {
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getPotencia() {
        return potencia;
    }

    //TODO Getters/Setters para el resto de los atributos que representan al Motor

    public void encender(){
        encendido = true;
    }
    
    public void apagar(){
       encendido = false;
    }

}
