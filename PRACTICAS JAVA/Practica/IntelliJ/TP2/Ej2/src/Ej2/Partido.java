package Ej2;

public class Partido implements Elemento{
    private Estadio estadio;
    private Equipo local;
    private Equipo visita;
    private float valor;

    public int valorElemento(){
        return capacidad();
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public int capacidad(){
        return estadio.getCapacidad();
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisita() {
        return visita;
    }

    public void setVisita(Equipo visita) {
        this.visita = visita;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
