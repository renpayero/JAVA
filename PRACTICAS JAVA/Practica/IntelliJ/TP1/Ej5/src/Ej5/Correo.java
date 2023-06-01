package Ej5;

import java.util.Vector;

public class Correo {

    private String origen;
    private String destino;
    private String direccionMail;

    private String texto;
    private boolean leido;
    private Vector<Contacto> contactosDestino=new Vector<Contacto>();
    private String asunto;




    public Correo(Correo origen, String texto, boolean leido, Vector<Contacto> contactosDestino, String asunto) {
        this.origen = origen;
        this.texto = texto;
        this.leido = leido;
        this.contactosDestino = contactosDestino;
        this.asunto = asunto;
    }

    public Correo getOrigen() {
        return origen;}

    public void setOrigen(Correo origen) {
        this.origen = origen;}

    public String getTexto() {
        return texto;}

    public void setTexto(String texto) {
        this.texto = texto;}

    public boolean isLeido() {
        return leido;}

    public void setLeido(boolean leido) {
        this.leido = leido;}

    public Vector<Contacto> getContactosDestino() {
        return contactosDestino;}

    public void setContactosDestino(Vector<Contacto> contactosDestino) {
        this.contactosDestino = contactosDestino;}

    public String getAsunto() {
        return asunto;}

    public void setAsunto(String asunto) {
        this.asunto = asunto;}

}
