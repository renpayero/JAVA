public class Circulo
{
    private Punto centro;
    private double radio;
    
    public Circulo(Punto miCentro, double miRadio) {
        centro=miCentro;
        radio=miRadio;
    }
    
    /**
     * Amplia el valor del radio según el parámetro
     */
    public void ampliar(int unValor) {
        radio+=unValor;
    }
    
    /**
     * Calcular el area
     * Math.PI
     */
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    /**
     * Traslada al círculo según los valores
     */
    public void trasladar(int x, int y) {
        //TODO Rehacer con operación sumarPunto(Punto unPunto) de Punto
        centro.setX(centro.getX()+x);
        centro.setY(centro.getY()+y);
    }
  
}
