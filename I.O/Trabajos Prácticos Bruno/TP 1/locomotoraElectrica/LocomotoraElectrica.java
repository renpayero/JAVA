public class LocomotoraElectrica
{
    //Atributos descriptivos
    private String tipoLocomotora; //VAPOR,ELECTRICA, DIESEL
    private int peso;
    private int longitud;
    private String fechaFabricacion;
    private int velocidadMaxima;
    
    //Atributos funcionales
    private boolean encendido = false;
    private int velocidadActual;
    
    //Operaciones
    public void encender() {
        encendido = true;
    }   
    
    public void apagar() {
        encendido = false;
    }   
    
    public void subirVelocidad() {
        if(velocidadActual < velocidadMaxima)
            velocidadActual++;
    }   

    public void reducirVelocidad() {             
       if(velocidadActual > 0)
            velocidadActual--;
    }   
    
    public void frenar() {
        velocidadActual=0;
    }
    
    public boolean estaEncendida() {
        return encendido;
    }
    
    //Getters y Setters
    
    public String getTipoLocomotora() {
        return tipoLocomotora;
    }
    
    public void setTipoLocomotora(String tipo) {
        tipoLocomotora = tipo;
    }

    public int getPeso() {
        return peso;
    }
    
    public void setPeso(int unPeso) {
        peso = unPeso;
    }
    
    public int getLongitud() {
        return longitud;
    }
    
    public void setLongitud(int unaLongitud) {
        longitud = unaLongitud;
    }
    
    public String getFabricacion() {
        return fechaFabricacion;
    }
    
    public void setFabricacion(String fecha) {
        fechaFabricacion = fecha;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public void setVelocidadMaxima(int velocidad) {
        velocidadMaxima = velocidad;
    }
   
    public int getVelocidadActual() {
        return velocidadActual;
    }

}
