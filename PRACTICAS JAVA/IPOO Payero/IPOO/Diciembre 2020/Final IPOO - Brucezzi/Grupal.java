import java.util.*;
public class Grupal extends Productos
{
    private List<Individual> grupales = new ArrayList<>();
    
    public double precio(){
        double precio=0;
        for(Individual c:grupales){
            precio+=c.precio();
        }
        return precio;
    }
    
    public boolean disponible(){
        int disponible=0;
        for(Individual c:grupales){
            disponible=c.getStock();
            if(disponible>0){
                return true;
            }
        }
        return false;
    }
}
