package Ejer5;

import java.util.*;

public class EstacionMeteorologica extends Observable {

    private List<Clima> historial = new ArrayList<Clima>();
    private Clima actual;

    private void notificarCambios() {
        setChanged();
        notifyObservers();
    }

    public void addClima(Clima c) {
        actual = c;
        historial.add(c);

        notificarCambios();
    }

    public void removeClima(Clima c) {
        if(c==actual) //Si el que borramos es el actual, lo ponemos en nulo debido a que ya no hay un clima actual
            actual=null;
        historial.remove(c);
        notificarCambios();
    }
    public Clima getActual() {
        return actual;
    }

    public List<Clima> getClimas(){
        return historial;
    }

    public List<Clima> ordenarClimaPorFecha() {
        historial.sort(Comparator.comparing(a->a.getFecha()));
        notificarCambios();
        return historial;
    }

    public Collection ordenarClimaPorTemperatura() {
        historial.sort(Comparator.comparing(a->a.getTemperatura()));
        notificarCambios();
        return historial;
    }
    public List<Clima> borrarHistorial(){
        historial.clear();
        return historial;
    }
}
