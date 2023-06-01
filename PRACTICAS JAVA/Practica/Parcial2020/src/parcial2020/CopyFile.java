package parcial2020;

public class CopyFile implements Task {
    private String origen;
    private String destino;
    private long duracion;
    private boolean processed;

    public CopyFile( String origen, String destino, long duracion){
        super();
        this.origen=origen;
        this.destino=destino;
        this.duracion=duracion;}
    @Override
    public double getDuracion(){
        return duracion;}
    @Override
    public String getName(){
        return origen+ " --> "+ destino;}

    @Override
    public User getOwner(){
        return null;}

    @Override
    public boolean isProcessed(){
        return processed;}

    @Override
    public void processed(){
        this.processed=true;}
}
