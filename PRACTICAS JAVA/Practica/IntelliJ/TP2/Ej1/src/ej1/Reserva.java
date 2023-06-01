package ej1;

public abstract class Reserva {

   private Cliente cliente;

   public float valor(){
       return cliente.aplicarDescuento(valorPlatoConDescuento());
   }

    public abstract float valorPlatoConDescuento();

   public abstract int totalPlatos();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
