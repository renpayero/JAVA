
public class Main
{
    public static void main(String[] args)
    {
        // Instanciar el objeto que será Observado
        UnObservado objObservado = new UnObservado();

        // Instanciar y registrar un Observador
        UnObservador objObservadorPepe  = new UnObservador("Pepe");
        objObservado.agregarObservador(objObservadorPepe);

        // Instanciar y registrar otro Observador
        UnObservador objObservadorJuan  = new UnObservador("Juan");
        objObservado.agregarObservador(objObservadorJuan);

        // Instanciar y registrar otro Observador
        UnObservador objObservadorMarta = new UnObservador("Marta");
        objObservado.agregarObservador(objObservadorMarta);
    }
}