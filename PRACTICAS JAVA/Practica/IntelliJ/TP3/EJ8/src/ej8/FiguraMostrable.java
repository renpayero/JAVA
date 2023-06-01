package ej8;

public interface FiguraMostrable extends Mostrable {

    public String getNombre();
    public String getColor();

    default String imprimir(){
        return getNombre()+getColor();}

}
