package parcial2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class Cola {

    private List<Proceso> procesos=new ArrayList<Proceso>();

    private Comparator<Proceso> comparator=new Comparator<Proceso>() {
        @Override
        public int compare(Proceso o1, Proceso o2) {
            return 0;
        }
    };

    public Proceso getNext() throws NoHayProcesosException{
        if(procesos.isEmpty()){
            return false;}
       return procesos
               .stream()
               .sorted(comparator)
               .findFirst()
               .get();}


}
