import java.util.List;
import java.util.ArrayList;

public class Auto
{
    private String marca;
    //Todos los atribuots del auto;
    
    private Motor motor;
    private Goma[] gomas = new Goma[4];
    private Puerta[] puertas = new Puerta[5];

    public Auto()
    {
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
       this.motor = motor;
    }

    public void addGoma(Goma goma, int pos) {
        gomas[pos]=goma;
    }
    
    public Goma getGoma(int pos) {
        return gomas[pos];
    }

    public void addPuerta(Puerta puerta, int pos) {
        puertas[pos]=puerta;
    }
    
    public Puerta getPuerta(int pos) {
        return puertas[pos];
    }
    
    public void encender() {
        motor.encender();
    }
    
    public void apagar(){
        motor.apagar();
    }
    
    public void cerrar(){
        for(int x=0; x < puertas.length; x++)
            puertas[x].cerrar();
    }
    
    //Getters/Setters de los atribuots del auto;
    
}
