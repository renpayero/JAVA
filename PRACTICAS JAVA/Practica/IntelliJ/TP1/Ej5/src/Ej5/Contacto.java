package Ej5;

public class Contacto {
    private String direMail;
    private String nombre;

    public String getDireMail() {
        return direMail;
    }

    public void setDireMail(String direMail) {
        this.direMail = direMail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Contacto(String direMail, String nombre) {
        this.direMail = direMail;
        this.nombre = nombre;
    }



}
