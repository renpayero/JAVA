package ej4;

public class TalkAdmin {

    public static void main(String[] args){
        Gato g=new Gato();
        TalkAdmin.hacerHablar(g);
        Perro p=new Perro();
        TalkAdmin.hacerHablar(p);
        RelojCUCU reloj=new RelojCUCU();
        TalkAdmin.hacerHablar(reloj);
    }

    public static void hacerHablar(Hablador h){
        System.out.println(h.hablar());}
}
