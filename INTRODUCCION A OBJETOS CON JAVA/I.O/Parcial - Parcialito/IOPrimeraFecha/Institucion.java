import java.util.Vector;

public class Institucion {

    private Localidad localidad;
    private Vector<Persona> tecnicos = new Vector<>();
    private Vector<Resultado> resultados = new Vector<>();

    public Institucion(Localidad localidad) {
       setLocalidad(localidad);
    }

    public void setTecnicos(Vector<Persona> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public Vector<Resultado> getResultados() {
        return resultados;
    }

    public void setResultados(Vector<Resultado> resultados) {
        this.resultados = resultados;
    }

    public Vector<Persona> getTecnicos() {
        return tecnicos;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
}
