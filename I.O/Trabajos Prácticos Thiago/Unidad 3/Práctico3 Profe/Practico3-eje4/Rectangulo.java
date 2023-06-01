public class Rectangulo extends Figura
{
    private double base;
    private double altura;
    
    public Rectangulo(int color, double base, double altura)
    {
        super(color);
        this.base= base;
        this.altura = altura;
    }
    
    public void pintar(){
        System.out.println("Pintando Rectangulo");
    }
    
    public double area(){
        return base * altura;
    }
    
    public void setAltura(double altura) {
       this.altura = altura;
    }
    public double getAltura() {
       return this.altura;
    }

    public void setBase(double base) {
       this.base = base;
    }
    public double getBase() {
       return this.base;
    }
}
