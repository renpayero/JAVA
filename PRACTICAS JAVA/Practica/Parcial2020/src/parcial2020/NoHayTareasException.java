package parcial2020;

public class NoHayTareasException extends Exception {
    private static final long serialVersionUTD=1L;

    @Override
    public String getMessage(){
        return "No hay mas tareas";}
}
