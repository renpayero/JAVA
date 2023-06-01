public class Contador
{

    private int valor;
    
    /*
    * Constructor defecto
    */
    public Contador(){
        iniciar();
    }

    /*
    * Constructor con N
    */

    public Contador(int n){
        iniciar(n);
    }
    
    /*
     * pone en 0 al contador.
     */
    public void iniciar() {
        iniciar(0);
    }
    
    /*
     * inicia al contador en un número N
     */
    public void iniciar(int n){
         valor = n;
    } 
    
    /*
     * suma de a uno
     */
    public void sumar(){
        sumar(1);
    } 

    /*
     * suma N sumar(1)
     */
    public void sumar(int n){
        valor+=n;
    } 
    
    /*
     * resta de a uno
     */
    public void restar(){
       restar(1);
    } 

    /*
     * resta N
     */
    public void restar(int n){
        valor-=n;
    } 

    public int valor() {
        return valor;
    }
}
