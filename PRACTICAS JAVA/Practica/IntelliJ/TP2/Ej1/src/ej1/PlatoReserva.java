package ej1;

public class PlatoReserva extends Reserva {
    private Plato platoDia;

    public float valorPlatoConDescuento(){
        return platoDia.getValor();
    }

    public int totalPlatos(){
        return 1;}

    public void setPlatoDia(Plato platoDia) {
        this.platoDia = platoDia;
    }
}
