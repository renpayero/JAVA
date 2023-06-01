package Ej2;

import java.util.Vector;

public class FIFA {
    private Vector<Partido> partidos=new Vector<Partido>();
    //private Vector<Estadio> estadios=new Vector<Estadio>()


    public void agregarPartido(Equipo local, Equipo visita, Estadio estadio, int valorEntrada){
        Partido p=new Partido();
        p.setLocal(local);
        p.setVisita(visita);
        p.setEstadio(estadio);
        p.setValor(valorEntrada);
        partidos.add(p);
    }

    //Retorna el estadio con mayor capacidad de espectadores
    public Estadio estadioConMayorCapacidad(){

            Partido mayor=null;

            for(Partido r:partidos)
                mayor=(Partido)Mayor.obtenerMayor(mayor, r);

            return mayor.getEstadio();}


    //Retorna la suma de todos los espectadores de todos los partidos. Es decir, la suma de la capacidad de cada
    //estadio de cada partido.

    public int cantidadTotalEspectadores(){
        int total=0;
        for(Partido p:partidos){
            total+=p.capacidad();
        }
        return total;}


    //Retorna la suma recaudada enel partido que se pasa como parametro.
    public float montoRecaudado(Partido partido){
        return partido.getValor();}

    //Retorna la suma total recaudad por todos los partidos del mundial.
    public float montoTotalRecaudado(){
        float total=0;
        for(Partido p:partidos){
            total+=p.getValor();}
        return total;}
}
