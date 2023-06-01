import java.util.Date;
import java.util.Calendar;
import java.text.*; 
import java.util.Calendar; 

public class DateUtil
{
    public DateUtil()
    {
    }

    public String toDate()
    {
       //Fecha actual
       Date hoy = Calendar.getInstance().getTime();
       return hoy.toString();
    }
    
    public String formatDate(String dt)
    {
         try { 
            //Obtengo una instancia(objetos) de tipo calendario
            Calendar cal = Calendar.getInstance(); 
            
            //Creo un objeto SimpleDateFormat
            SimpleDateFormat SDFormat = new SimpleDateFormat("dd/MM/yyyy"); 
            
            //Al objeto calendario le asigno la fecha parseada en el formato dd/MM/yyyy
            cal.setTime(SDFormat.parse(dt)); 
            
            //Retorno la fecha
            Date date = cal.getTime();
            return date.toString();
        }
        catch (ParseException excpt) { 
            excpt.printStackTrace(); 
            return null;
        } 
    }
}
