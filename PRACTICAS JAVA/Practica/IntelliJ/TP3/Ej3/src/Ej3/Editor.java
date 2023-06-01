package Ej3;

import java.util.Vector;

public class Editor implements Desplazable {

    private Vector<Figura>figuras=new Vector<Figura>();

    public void addFigura(Figura figura){
        figuras.add(figura);
    }

    public void removeFigura(Figura figura){
        figuras.remove(figura);}

    




}
