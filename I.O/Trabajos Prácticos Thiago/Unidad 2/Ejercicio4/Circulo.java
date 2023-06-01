public class Circulo
{
    // instance variables - replace the example below with your own
    private Punto centro;
    private double radio;
    private double area;
    
    public void ampliar(int unValor){
        radio = radio + unValor;
    }

    public void area(){
        area = Math.PI * Math.pow(radio ,2);
    }
    
    public Punto getCentro(){
        return centro;
    }
    
    public void setCentro(Punto centro){
        this.centro = centro;
    }
    
    public void trasladarCentro(Punto unPunto){
        centro.sumarPunto(unPunto);
    }
}