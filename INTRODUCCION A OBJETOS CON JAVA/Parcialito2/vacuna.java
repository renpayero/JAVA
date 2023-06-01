import java.util.Date;
abstract class vacuna
{
    private int lote;
    private int partida;
    private Date fechaElaboracion;
    private laboratorio laboratorio;
    private String componentes;
    private personaVacunada personaVacunada;
    
    public void setLote(int lote){
        this.lote=lote;
    }
    public int getLote(){
        return lote;
    }
    public void setPartida(int partida){
        this.partida=partida;
    }
    public int getPartida(){
        return partida;
    }
    public void setFechaElaboracion(Date fechaElaboracion){
        this.fechaElaboracion=fechaElaboracion;
    }
    public Date getFechaElaboracion(){
        return fechaElaboracion;
    }
    public void setLaboratorio(laboratorio laboratorio){
        this.laboratorio=laboratorio;
    }
    public laboratorio getLaboratorio(){
        return laboratorio;
    }
    public void setComponentes(String componentes){
        this.componentes=componentes;
    }
    public String getComponentes(){
        return componentes;
    }
    public void setPersonaVacunada(personaVacunada personaVacunada){
        this.personaVacunada=personaVacunada;    
    }
    public personaVacunada getPersonaVacunada(){
        return personaVacunada;
    }
    public void vacunaSimple(personaVacunada persona, laboratorio laboratorio){
        personaVacunada=persona;
        laboratorio=laboratorio;
    }
    
}
