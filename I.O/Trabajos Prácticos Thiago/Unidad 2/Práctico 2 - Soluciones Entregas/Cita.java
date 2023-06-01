import java.util.Date;

public class Cita
{
    private Date fecha;
    private Persona contactoOrigen;
    private Persona contactoDestino;
    private int importancia;
    private Lugar lugar;
    
    public Cita()
    {
    }
    
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
       this.fecha = fecha;
    }

    public Persona getContactoOrigen() {
        return contactoOrigen;
    }
    public void setContactoOrigen(Persona contacto) {
       this.contactoOrigen = contacto;
    }

    public Persona getContactoDestino() {
        return contactoDestino;
    }
    public void setContactoDestino(Persona contacto) {
       this.contactoDestino = contacto;
    }
    
    public int getImportancia() {
        return importancia;
    }
    public void setImportancia(int importancia) {
       this.importancia = importancia;
    }
    
    public Lugar getLugar() {
        return lugar;
    }
    public void setLugar(Lugar fecha) {
       this.lugar = lugar;
    }
}
