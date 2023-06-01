import java.util.ArrayList;

public abstract class Usuario
{
   private String nameUser;
   private ArrayList<Juego> juegos=new ArrayList<Juego>();
   private Persona persona;
   
   public void setNameUser(String nameUser){
       this.nameUser=nameUser;}
       
    public void setPersona(Persona persona){
        this.persona=persona;}
        
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
