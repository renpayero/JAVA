
public class Main
{
    public static void main(String[] args)
    {
        Adaptador conversor=new Adaptador();
        conversor.ingresarPesos(2000);
        conversor.ingresarPesos(5000);
        conversor.ingresarPesos(1000);
        System.out.println("Total euros: "+conversor.getSaldo());
    }
}
