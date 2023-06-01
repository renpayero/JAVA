public class Contador
{
    // instance variables - replace the example below with your own
    private int valor;

    public void iniciar(){
        iniciar(0);
    }
    
    public void iniciar(int n){
        valor = n;
    }
    
    public void sumar(){
        sumar(1);
    }
    
    public void sumar(int n){
        valor = valor + n;
    }
    
    public void restar(){
        restar(1);
    }
    
    public void restar(int n){
        valor = valor - n;
    }
}
