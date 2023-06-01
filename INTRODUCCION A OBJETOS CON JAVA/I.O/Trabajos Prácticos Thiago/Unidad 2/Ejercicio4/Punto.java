public class Punto
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private Punto unPunto;
    
    public void sumarValor(int unValor){
        x = x + unValor;
        y = y + unValor;
    }
    
    public void sumarPunto(Punto unPunto){
        x = x + unPunto.getX();
        y = y + unPunto.getY();
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setX(int unValor){
            x = unValor;
    }
        
    public void setY(int unValor){
            y = unValor;
    }
    
    public void distanciaDe(Punto unPunto){
        unPunto.x = (unPunto.x-x)^2;
        unPunto.y = (unPunto.y-y)^2;
    }
    
    public void distanciaOrigen(){
        Punto p = new Punto();
        p.setX(0);
        p.setY(0);
        distanciaDe(p);
    }   
}