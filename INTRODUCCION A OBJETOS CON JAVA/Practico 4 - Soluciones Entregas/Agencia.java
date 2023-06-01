import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;

public class Agencia {

    private Vector<Cobro> cobros = new Vector<Cobro>();
        
    public void agregarCobroAnual(Bien bien) {
        Anual anual = new Anual();
        
        anual.setBien(bien);
        anual.setFecha(Calendar.getInstance().getTime());
        
        cobros.add(anual);
    }
    
     public float valorCobro(Cobro cobro) {
         return cobro.monto();
     }
     
     public float sumaCobros() {
         float suma = 0;
         
         for(Cobro c:cobros) {
             //Reusamos el valorCobro anterior
             suma+=valorCobro(c);
         }
         
         return suma;
     }
     
     public Cobro cobroMayor() {
         float mayor = 0;
         Cobro cMayor = null;
         
         for(Cobro c:cobros) {
            if (valorCobro(c) > mayor) {
                mayor = valorCobro(c);
                cMayor = c;
            }
         }
         
         return cMayor;
     }
     
     public Vector<Cobro> cobroMayoresA(float valor) {
         Vector<Cobro> mayores = new Vector<Cobro>();
         
         for(Cobro c:cobros) {
            if (valorCobro(c) > valor) {
                mayores.add(c);
            }
         }
         
         return mayores;
     }     
    
     public float valorFiscal() {
         float suma = 0;
         
         for(Cobro c: cobros) {
             suma+=c.getValorFiscal();
         }
         
         return suma;
     }
     
}
