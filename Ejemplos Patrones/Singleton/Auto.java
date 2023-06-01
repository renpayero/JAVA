
public class Auto
{
    private static Auto instancia;

    private Auto() {
    }
    public static Auto getInstancia()
    {
        if (instancia == null) {
            instancia = new Auto();
            System.out.println("El objeto ha sido creado");
        }
        else {
            System.out.println("Ya existe el objeto");
        }

        return instancia;
    }
}

