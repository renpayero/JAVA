import java.util.List;
import java.util.Vector;

public class Auto{   
    
    private String marca;
    private String color;
    
    private int maxRuedas;
    private int maxPuertas;
    
    //TODO Agregar el resto de los atributos que representan al Auto
    
    private Motor motor;
    private Vector<Rueda> ruedas = new Vector<Rueda>();
    private Vector<Puerta> puertas = new Vector<Puerta>();

    public Auto(int maxPuertas, int maxRuedas)    {
        setMaxPuertas(maxPuertas);
        setMaxRuedas(maxRuedas);
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
       this.motor = motor;
    }

    public void addRueda(Rueda rueda) {
       if(getRuedas().size() < getMaxRuedas())
        getRuedas().add(rueda);
    }
    
    public Vector<Rueda> getRuedas() {
        return ruedas;
    }

    public void addPuerta(Puerta puerta) {
        if(getPuertas().size() < getMaxPuertas())
            getPuertas().add(puerta);
    }
    
    public Vector<Puerta> getPuertas() {
        return puertas;
    }
    
    public void encender() {
        motor.encender();
    }
    
    public void apagar(){
        motor.apagar();
    }
    
    public void cerrar(){
        for(Puerta puerta : getPuertas()){
            puerta.cerrar();
        }
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
       this.color = color;
    }
    
    public void setMaxPuertas(int max){
        this.maxPuertas = max;
    }
    
    public int getMaxPuertas(){
        return this.maxPuertas;
    }
    
    public void setMaxRuedas(int max){
        this.maxRuedas = max;
    }
    
    public int getMaxRuedas(){
        return this.maxRuedas;
    }
    // TODO Getters/Setters para el resto de los atributos que representan al Auto
    
}
