package parcial2020;

public class User extends Persona{
    private String nombreUsuario;
    private String password;

    public User(String nombre, String DNI, int edad, String nombreUsuario, String password) {
        super(nombre, DNI, edad);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
