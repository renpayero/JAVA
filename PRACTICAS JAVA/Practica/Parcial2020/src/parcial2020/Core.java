package parcial2020;

public class Core {

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    private boolean ocupado;

    public void procesar(Proceso proceso){
        setOcupado(true);
        proceso.procesarTodasLasTareas();
        setOcupado(false);}

    public boolean isOcupado(){
        return ocupado;}



}
