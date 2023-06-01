package parcial2020;

public class Persona {
    private String nombre,DNI;
    private int edad;

    public Persona(String nombre,String DNI,int edad){
        super();
        setNombre(nombre);
        setDNI(DNI);
        setEdad(edad);}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
