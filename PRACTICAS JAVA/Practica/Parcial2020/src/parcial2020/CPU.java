package parcial2020;

import java.util.*;

public class CPU {
    private Cola cola;
    private List<Core> cores=new ArrayList<Core>();
    //Procesa el siguiente proceso según la prioridad
    public void procesarNextProceso() {
        try {
            Proceso next = cola.getNext();
            getCore().procesar(next);
        } catch (NoHayProcesosException e) {
            e.printStackTrace();
        }
    }

    private Core getCore(){
        return cores
                .stream()
                .filter(core ->!core.isOcupado())
                .findAny()
                .get();
    }
}
