package Ej3;

public abstract class Figura implements Desplazable {

    private Punto origen;

    public Figura(Punto origen){
        this.origen=origen;}

    public Punto getOrigen(){
        return origen;}

    public void setOrigen(Punto origen){
        this.origen=origen;}

    public void mover(Punto p){
        origen.sumar(p);}

    public void mover(int unPunto, Direccion direccion){
        Punto p=null;
        int valor=Math.abs(unPunto);

        if(direccion.compareTo(Direccion.NORTE)==0){
            p=new Punto(0,valor);
        }
        elif(direccion.compareTo(Direccion.SUR)==0){
            p=new Punto(0,-valor);}
        elif(direccion.compareTo(Direccion.ESTE)==0){
            p=new Punto(-valor,0);}
        elif(direccion.compareTo(Direccion.OESTE)==0){
            p=new Punto(valor,0);}

    }


    public abstract double area();


}
