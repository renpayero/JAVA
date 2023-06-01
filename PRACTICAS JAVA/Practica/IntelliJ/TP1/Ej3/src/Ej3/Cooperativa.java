package Ej3;
import java.util.Vector;

public class Cooperativa {

    private Vector<String> socios = new Vector<String>();
    private Vector<Chofer> choferes = new Vector<Chofer>();
    private Vector<Colectivo> colectivos = new Vector<Colectivo>();


    public Chofer realizarViaje(int cantidadPasajeros, float cantidadKilometros) {
        for (Chofer c : choferes) {
            if (c.realizarViaje(cantidadPasajeros, cantidadKilometros)) {
                return c;
            }

        }
        return null;
    }
    public Colectivo mayorKilometro() {
        float kilometrosRecorridos = 0;
        Colectivo mayor=new Colectivo();
        for (Colectivo c : colectivos) {
            if (c.getKilometraje() > kilometrosRecorridos) {
                mayor=c;}
            }
        return mayor;
        }

}





