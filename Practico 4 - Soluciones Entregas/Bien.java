
public abstract class Bien {

    private int nroIdentificacion;
    private float valorFiscal;
    private String titular;
    
    public int getNroIdentificacion() {
        return nroIdentificacion;
    }
    public void setNroIdentificacion(int nroIdentificacion) {
        this.nroIdentificacion = nroIdentificacion;
    }
    public float getValorFiscal() {
        return valorFiscal;
    }
    public void setValorFiscal(float valorFiscal) {
        this.valorFiscal = valorFiscal;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    abstract public float monto();
    
}