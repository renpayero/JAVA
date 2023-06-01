public class Circulo extends Figura
{
   private double radio;
    
   public Circulo(int color, double radio)
   {
        super(color);
        this.radio= radio;
   }
    
   public void pintar(){
       System.out.println("Pintando Circulo");
   }
    
   public double area(){
        return Math.PI * Math.pow(radio, 2);
   }

   public void setRadio(double radio) {
       this.radio = radio;
   }
   public double getRadio() {
       return this.radio;
   }

}
