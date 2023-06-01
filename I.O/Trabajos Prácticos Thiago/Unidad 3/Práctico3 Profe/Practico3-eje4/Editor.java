import java.util.List;
import java.util.ArrayList;

/**
 * Uso:

 * Editor e = new Editor();
 * 
 * Rectangulo r = new Rectangulo(Figura.ROJO, 12,20);
 * e.agregarFigura(r);
 * 
 * Circulo c = new Circulo(Figura.AZUL, 20);
 * e.agregarFigura(c); 
 * 
 * e.area();
 */
public class Editor
{
    private List<Figura> figuras = new ArrayList<Figura>();
    
    public Editor()
    {
    }

    public void agregarFigura(Figura f){
        figuras.add(f);
    }
    
    public void borrarFigura(Figura f){
        figuras.remove(f);
    }

    public void pintar() {
        for(Figura f:figuras) {
            f.pintar();
        }
    }
    
    public double area() {
        double total = 0;
        
        for(Figura f:figuras) {
            total+=f.area();
        }
        
        return total;
    }

}
