public class Rueda
{
    private String marca;
    private double presion;
    
    //TODO Agregar el resto de los atributos que representan a la Rueda

    public Rueda()
    {
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public double getPresion() {
        return presion;
    }

    // TODO Getters/Setters para el resto de los atributos que representan a la Rueda
    
    public void inflar(double valor) {
        presion+=valor;
    }
    
    public void desinflar(double valor) {
        presion-=valor;
    }

}
