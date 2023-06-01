public class Simple extends Vacuna
{
    
    private Componente componente;
    
    public Simple(Persona persona, Laboratorio laboratorio)
    {
        super(persona, laboratorio);
    }

    public void setComponente(Componente c) {
        componente = c;
    }
    
    public int cantidadComponentes() {
        return 1;
    }
    
    public int cantidadVacunasSimpleAplicadas() {
        return 1;
    }
}
