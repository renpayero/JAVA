

public class AireAcondicionado
{
    private int temperatura;
    private boolean prendido;
    private PersonaMantenimiento mantenimiento;

    public void SubirTemperatura(int Temperatura){
        temperatura = temperatura + Temperatura;
    }
    
    public void BajarTemperatura(int Temperatura){
        temperatura = temperatura - Temperatura;
    }
    
    public void Prender(){
        prendido = true;
    }
    
    public void Apagar(){
       prendido = false;
    }
    
    public PersonaMantenimiento getMantenimiento(){
        return mantenimiento;
    }
    
    public void setMantenimiento(PersonaMantenimiento Mantenimiento){
        this.mantenimiento = Mantenimiento;
    }
}
