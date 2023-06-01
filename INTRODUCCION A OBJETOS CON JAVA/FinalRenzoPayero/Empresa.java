import java.util.ArrayList;

public class Empresa
{
    private ArrayList<Juego>juegos=new ArrayList<Juego>();
    private ArrayList<Venta> ventas=new ArrayList<Venta>();
    private ArrayList<Usuario> usuarios= new ArrayList<Usuario>();
    

    public void agregarJuego(Juego unJuego){
        juegos.add(unJuego);}

    public void agregarVariosJuegos(ArrayList<Juego>juegos){
        juegos.addAll(juegos);
    }

    public float montoTotalVentas(){
        float total=0;
        for (Venta v:ventas){
            total+=v.getMonto();}
            
        return total;}

    public float promedioDeJuegos(){
        float promedio;
        int jugadores=usuarios.size();
        int cantJuegos=juegos.size();
        
        promedio=cantJuegos/jugadores;
        return promedio;
    }
    
    public void nuevaVenta(ArrayList<Juego> juegos, Usuario usuario, medioDePago medioDePago){
        Venta ventas=new Venta();
        //this.ventas.add(juegos);
        //this.ventas.add(usuario);
        //this.ventas.add(medioDePago);
        
        
    }

    
  
}
