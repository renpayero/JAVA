package Ej5;

import java.util.Vector;

public class ClienteCorreo {

    private Correo cuenta;

    public ClienteCorreo(Correo cuenta){this.cuenta=cuenta;}

    public Correo getCuenta() {
        return cuenta;
    }
    public void setCuenta(Correo cuenta) {
        this.cuenta = cuenta;
    }


}
