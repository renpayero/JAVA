package parcial2020;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.List;


public class Proceso {
    private Long id;
    private User owner;
    private Long prioridad;

    private List<Task>tasks=new ArrayList<Task>();

    public Proceso(long id,User owner,long prioridad){
        super();
        this.id=id;
        this.owner=owner;
        this.prioridad=prioridad;
        tasks=new ArrayList<Task>();}

    public Task getNext() throws NoHayTareasException {
        try{
            return tasks
                    .stream()
                    .findFirst()
                    .get();}
        catch (NoSuchElementException e){
            throw new NoHayTareasException();}
    }
    public void procesarTodasLasTareas(){
        tasks.forEach(tasks ->tasks.processed());
    }

    //Retorna TRUE si todas las tareas fueron procesadas. FALSE en caso contrario
    public boolean isProcessed(){

    }
    public Long getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(Long prioridad) {
        this.prioridad = prioridad;
    }

}
