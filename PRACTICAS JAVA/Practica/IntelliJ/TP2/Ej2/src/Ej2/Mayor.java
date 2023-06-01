package Ej2;

public class Mayor {

    public static Elemento obtenerMayor(Elemento e1,Elemento e2){
            return (e1==null?e2:
                    (e2==null?e1:
                    (e2.valorElemento()>e1.valorElemento()? e2: e1)));
    }

}
