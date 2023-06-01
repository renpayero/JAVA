public class Punto
{
    private int x;
    private int y;
    
    /**
     * Constructor defecto
     */
    public Punto(int x, int y) {
        this.x=x;
        this.y=y;
    }
    
    /**
     * Suma el mismo valor a x e y ́
     */
    public void sumarValor(int unValor) {
        x+=unValor;
        y+=unValor;
    }
    
    /**
     * Suma las coordenas x y las coordenas y ́
     */
    public void sumarPunto(Punto unPunto) {
    }
    
    /**
     * Calcula la distancia por Pitágoras ́
    */
    public double distanciaDe(Punto unPunto) {
        return 0.0;
    }
    
    /**
     * Calcula la distancia por Pitágoras al origen ́
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
     * Math.pow(base, exp)
     * Math.sqrt(valor)
     * System.out.println(Math.pow(5, 2));
     */
    public double distanciaAlOrigen(){
        return 0.0;
    }
    
    public void setX(int miX){
        x=miX;
    }
    public int getX(){
        return x;
    }
    
    public void setY(int miY){
        y=miY;
    }
    public int getY(){
        return y;
    }

}
