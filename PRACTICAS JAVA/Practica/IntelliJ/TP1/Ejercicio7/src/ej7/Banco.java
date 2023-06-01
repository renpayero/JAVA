package ej7;

import java.util.Vector;

public class Banco {
    private String nombre;
    private String ubicacion;
    private Vector<Transaccion> transacciones=new Vector<Transaccion>();
    private Vector<Cliente> clientes=new Vector<Cliente>();


    public void agregarTransaccion(Transaccion unaTransaccion){
        transacciones.add(unaTransaccion);}

    public void agregarCliente(Cliente unCLiente){
        clientes.add(unCLiente);}

    public int cantidadTransacciones(){
        return transacciones.size();}

    public float impuestoACobrarDe(Transaccion unaTransaccion){
        return unaTransaccion.montoConImpuestos();}


    public float impuestosACobrar(){
        float impuestos=0;
        for(Transaccion t: transacciones){
            impuestos=t.montoConImpuestos()-t.montoPesos();
        }
        return impuestos;
    }

    public float montoTotalDeTransacciones(){
        float total=0;
        for(Transaccion t: transacciones){
            total=t.montoConImpuestos();}
        return total;}


    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getUbicacion() {return ubicacion;}

    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion;}
}
