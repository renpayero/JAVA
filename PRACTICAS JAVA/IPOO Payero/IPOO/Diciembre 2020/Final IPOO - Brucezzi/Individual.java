
public class Individual extends Productos
{
    private double valor;
    private int stock;
    
    public void setValor(double valor){
        this.valor=valor;
    }
    public double getValor(){
        return valor;
    }
    
    public double precio(){
        return getValor();
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public int getStock(){
        return stock;
    }
    
    public boolean disponible(){
        if(getStock()>0){
            return true;
        }
        return false;
    }
}
