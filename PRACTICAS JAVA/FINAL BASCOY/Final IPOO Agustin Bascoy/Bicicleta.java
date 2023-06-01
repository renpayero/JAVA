public class Bicicleta
{
    
    private boolean disponible=true;
    
    public boolean liberar(){
        disponible=true; //Liberamos la bici
        return disponible;
        }
    public boolean disponible(){
        return disponible;
    }
        
    public boolean ocupar(){
        disponible=false; //Ocupamos la bici
        return disponible;
    }

}
