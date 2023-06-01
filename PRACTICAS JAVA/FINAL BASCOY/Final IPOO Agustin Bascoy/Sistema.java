import java.util.List;
import java.util.ArrayList;

public class Sistema
{
    private List<Bicicleta>coleccion=new ArrayList<Bicicleta>();
    
    public void main(){ //Creamos las 15 bicicletas
        for(int i=0;i<15;i++){
            coleccion.add(new Bicicleta());
        }
    }
            
    
    
    public void ocuparBici(Bicicleta s){
        if(s.disponible()==true){ //Si la bici esta disponible:
            s.ocupar(); //La ocupamos
            System.out.println("Se ha ocupado la bici");
        }
        else{ //Sino, quiere decir que ya esta ocupada.
            System.out.println("Bicicleta ocupada, elija otra");
        }          
    }
    
    public void liberarBici(Bicicleta a){
        if(a.disponible()==false){ //Si la bici esta ocupada, la liberamos
            a.liberar();
            System.out.println("Se libero la bicicleta");
        }
        else{ //Si la bici no esta ocupada,se deja como esta, ya que ya esta liberada
            System.out.println("La bici no estaba ocupada");
        }
    }
        
    
    
}
