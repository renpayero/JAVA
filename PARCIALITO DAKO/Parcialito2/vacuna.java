import java.util.Date;
public class vacuna
{
    private int lote;
    private Date fechaPartida;
    private Date fechaElaboracion;
    private String laboratorio;
    private String componentes;
    
    public void setLote(int lote){
        this.lote=lote;
    }
    public int getLote(){
        return lote;
    }
    public void setFechaPartida(Date fechaPartida){
        this.fechaPartida=fechaPartida;
    }
    public Date getFechaPartida(){
        return fechaPartida;
    }
    public void setFechaElaboracion(Date fechaElaboracion){
        this.fechaElaboracion=fechaElaboracion;
    }
    public Date getFechaElaboracion(){
        return fechaElaboracion;
    }
    public void setLaboratorio(String laboratorio){
        this.laboratorio=laboratorio;
    }
    public String getLaboratorio(){
        return laboratorio;
    }
    public void setComponentes(String componentes){
        this.componentes=componentes;
    }
    public String getComponentes(){
        return componentes;
    }
}
