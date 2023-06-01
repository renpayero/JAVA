package ej1;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Vector;

public class Comedor {

    private Vector<Reserva> reserva=new Vector<Reserva>();

    public void agregarReserva(Cliente cliente, Plato plato){
        PlatoReserva p=new PlatoReserva();
        p.setPlatoDia(plato);
        p.setCliente(cliente);
        reserva.add(p);}

    public void agregarReserva(Cliente cliente, Vector<Plato> platos){
        MultiplePlatoReserva m=new MultiplePlatoReserva();
        m.addPlatos(platos);
        m.setCliente(cliente);
        reserva.add(m);}



    public float valorReserva(Reserva reserva){
        return reserva.valor();
    }

    public int totalPlatosReservados(){
        int contador=0;

        for (Reserva r:reserva){
            contador+=r.totalPlatos();}
        return contador;}




    public float totalValorReservas(){
        float total=0;

        for(Reserva r:reserva){
            total+=r.valor();
        }
        return total;

    }

    public float totalValorReservasConStream(){
        float r=(float) reservas
                .stream().mapToDouble(e-> e.getPrecio())
                .sum();
    }

    public Reserva reservaMasPlatos(){
        Reserva mayor=null;

        for(Reserva r:reserva)
            mayor=(mayor==null? r: (r.totalPlatos()>mayor.totalPlatos()? r: mayor));

        return mayor;
    }

    public Reserva reservaMasPlatosConStream(){
        Reserva r=reserva
                .stream()
                .max(Comparator.comparing(Reserva::getCantidadPlatos))
                .orElseThrow(NoSuchElementException::new);
        return r;
    }



}
