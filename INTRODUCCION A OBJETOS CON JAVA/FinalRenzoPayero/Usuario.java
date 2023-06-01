import java.util.ArrayList;

public abstract class Usuario
{
    private String nombrePersona;
    private int edadPersona;
    private String nameUser;
    private ArrayList<Juego> juegos=new ArrayList<Juego>();

   public void setNombrePersona(String nombrePersona){
        this.nombrePersona=nombrePersona;
    }
    public void edadPersona(int edadPersona){
        this.edadPersona=edadPersona;
    }
    public void setNameUser(String nameUser){
       this.nameUser=nameUser;}
        
    public void addJuego(Juego juego){
        juegos.add(juego);}
        
    public void removeJuego(Juego juego){
        juegos.remove(juego);}
        
    public ArrayList getJuegos(){
        return juegos;}
    
    public int cantidadJuegos(){
        return juegos.size();}
        
    public abstract float getDescuento();
        
    
   
}
