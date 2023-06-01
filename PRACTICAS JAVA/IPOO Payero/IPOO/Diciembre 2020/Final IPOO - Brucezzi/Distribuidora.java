import java.util.*;

public class Distribuidora
{
    private List<Productos> productos = new ArrayList<>();
    
    public double precio(Productos c){
        return c.precio();
    }
    
    public boolean disponible(Productos c){
        return c.disponible();
    }
}
