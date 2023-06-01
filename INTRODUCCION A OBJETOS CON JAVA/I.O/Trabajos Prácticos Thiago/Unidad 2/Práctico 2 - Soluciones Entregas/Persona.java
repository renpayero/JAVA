public class Persona
{
    private String nombre;
    private String apellido;
    private double altura;
    //TODO Agregar el resto de los atributos que representan a la Persona
    
    public Persona()
    {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    
    // TODO Getters/Setters para el resto de los atributos que representan a la Persona
}
