import java.util.Date;

public abstract class Cobro {

    private Date fecha;
    private Bien bien;
    
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Bien getBien() {
        return bien;
    }
    public void setBien(Bien bien) {
        this.bien = bien;
    }    
            
    public float getValorFiscal(){
        return getBien().getValorFiscal();
    }
    
    abstract public float monto();
    
}
