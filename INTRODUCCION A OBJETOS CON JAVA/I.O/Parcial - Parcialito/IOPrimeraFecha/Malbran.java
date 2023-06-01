import java.util.Vector;

public class Malbran {

    private Vector<Institucion> instituciones = new Vector<Institucion>();
    private Vector<Resultado> resultados = new Vector<Resultado>();
    private Persona director;

    public Malbran(Persona director) {
        setDirector(director);
    }

    public Vector<Institucion> getInstituciones() {
        return instituciones;
    }

    public void setInstituciones(Vector<Institucion> instituciones) {
        this.instituciones = instituciones;
    }

    public Vector<Resultado> getResultados() {
        return resultados;
    }

    public void setResultados(Vector<Resultado> resultados) {
        this.resultados = resultados;
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }
    
    /*
     * Agrega un resultado positivo en la coleccion de resultados. 
     * Ademas agrega la institucion si es que la misma no esta agregada aun
     */
    public void agregarResultadoPositivo(Test test, Institucion institucion) {
    	Resultado resultado = new Resultado(test, institucion, true);
    	getResultados().add(resultado);
    	
    	agregarInstitucion(institucion);
    }

    /*
     * Agrega la institucion si es que la misma no esta agregada aun
     */
	public void agregarInstitucion(Institucion institucion) {
		if (!getInstituciones().contains(institucion))
    		getInstituciones().add(institucion);
	}
    
	/*
	 * Retorna el tiempo total de todos los tests
	 */
    public double tiempoTotalMinutos() {
    	double total = 0;
    	for(Resultado resultado : getResultados())
    		total =+ resultado.getTiempo();
    	
    	return total;
    }
    
    /*
     * Retorna la cantidad de test Serologicos realizados
     */
    public int getTotalSerologicos() {
    	int total = 0;
    	for(Resultado resultado : getResultados())
    		total =+ resultado.getTotalSerologicos(total);
    	
    	return total;
    }
}
