public class Punto
{
    private int x;
    private int y;
    
    public Punto(int x, int y) {
        this.x=x;
        this.y=y;
    }

    //Constructor Defecto
    public Punto() {
        this(0, 0);
    }
    /**
     * Suma el mismo valor a x e y ́
     */
    public void sumarValor(int unValor) {
        setX(getX() + unValor);
        setY(getY() + unValor);
    }
    
    /**
     * Suma las coordenas x y las coordenas y ́
     */
    public void sumarPunto(Punto unPunto) {
        setX(getX() + unPunto.getX());
        setY(getY() + unPunto.getY());
    }
    
    /**
     * Calcula la distancia por Pitágoras ́
    */
    public double distanciaDe(Punto unPunto) {
        double radicando = Math.pow(unPunto.getX() - x, 2) + Math.pow(unPunto.getY() - y, 2);
        return Math.sqrt(radicando);
    }
    
    /**
     * Calcula la distancia por Pitágoras al origen ́
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
     * Math.pow(base, exp)
     * Math.sqrt(valor)
     * System.out.println(Math.pow(5, 2));
     */
    public double distanciaAlOrigen(){
        return distanciaDe(new Punto());
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
