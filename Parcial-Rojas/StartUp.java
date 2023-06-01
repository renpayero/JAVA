import java.util.ArrayList;

public class StartUp
{
    private ArrayList<Juego>juegos=new ArrayList<Juego>();
    private ArrayList<Venta> ventas=new ArrayList<Venta>();
    private ArrayList<Usuario> usuarios= new ArrayList<Usuario>();
    
    /*Agrega un juego a la plataforma*/
    public void agregarJuego(Juego unJuego){
        juegos.add(unJuego);}
        
    /*Agrega varios juegos a la plataforma*/
    
    /*public void agregarVariosJuegos(ArrayList<Juego>juegoss){
        for(Juego j:juegoss){
            juegos..add(juegoss.getTitulo());
        }
        }*/
        
    /*Retorna monto total de las ventas realizadas hasta el momento*/
    public float montoTotalVentas(){
        float total=0;
        for (Venta v:ventas){
            total+=v.getMonto();}
            
        return total;}
        
    /*Retorna el promedio de juegos en la bibloteca de los jugadores*/
    
    public float promedioDeJuegos(){
        float promedio;
        int jugadores=0;
        int cantJuegosJugador=0;
        
        for(Usuario us:usuarios){
            jugadores+=1;
            cantJuegosJugador+=us.cantidadJuegos();}
        
        promedio=cantJuegosJugador/jugadores;
        return promedio;
    }
        
    
    
        
    
}
