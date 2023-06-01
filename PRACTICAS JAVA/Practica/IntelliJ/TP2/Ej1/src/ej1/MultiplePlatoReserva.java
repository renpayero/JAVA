package ej1;

import java.util.Vector;

public class MultiplePlatoReserva extends Reserva {

    private Vector<Plato> platos=new Vector<Plato>();

    public void addUnPlato(Plato plato){
        platos.add(plato);
    }

    public int totalPlatos(){
        return platos.size();
    }

    public void addPlatos(Vector<Plato> platoss){
        platos.addAll(platoss);}

    public float valorPlatoConDescuento() {
        float precio = 0;
        for (Plato p : platos) {
            precio += p.getValor();

        }
        return precio -= (precio * 5) / 100;
    }




}
