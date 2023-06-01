package ej7;

public class Main {
    public static void main(String[] args){
        International t=new International();

        t.setMonto(23);
        t.setMoneda(Moneda.EURO);
        System.out.println(t.montoPesos());

        International t2=new International();

        t2.setMonto(28);
        t2.setMoneda(Moneda.YEN);
        System.out.println(t.montoPesos());

        Nacional t3=new Nacional();
        t3.setMonto(16);
        System.out.println(t.montoPesos());

        Banco banco=new Banco();
        banco.agregarTransaccion(t);
        banco.agregarTransaccion(t2);
        banco.agregarTransaccion(t3);
        banco.agregarCliente(new Cliente());
        System.out.println(banco.impuestosACobrar());
        System.out.println(banco.montoTotalDeTransacciones());
    }
}
