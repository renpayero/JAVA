import java.util.Vector;

public class Institucion
{

    private Vector<Tecnico> tecnicos = new Vector<Tecnico>();
    private Vector<Resultado> resultados = new Vector<Resultado>();
    private Localidad localidad;

    public Institucion()
    {
    }

    public void addResultado(Resultado resultado) {
        resultados.add(resultado);
    }
}
