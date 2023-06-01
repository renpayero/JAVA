
public class MuestraSangre
{
    private String muestra;
    private boolean factor;        // + y -
    
    public void setMuestra(String muestra){
        if (muestra=="A"){this.muestra=muestra;}
        if (muestra=="B"){this.muestra=muestra;}
        if (muestra=="AB"){this.muestra=muestra;}
        if (muestra=="0"){this.muestra=muestra;}
    }
    public String getMuestra(){
        return muestra;
    }
    
    public void setFactor(boolean factor){
        this.factor=factor;
    }
    public boolean getFactor(){
        return factor;
    }
}
