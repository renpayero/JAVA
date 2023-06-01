import java.util.Vector;

public class Multiple extends Vacuna
{
    
    private Vector<Componente> componentes = new Vector<Componente>();
    
    public Multiple(Persona persona, Laboratorio laboratorio)
    {
        super(persona, laboratorio);
    }

    public void addComponente(Componente c) {
        componentes.add(c);
    }
    
    public int cantidadComponentes() {
        return componentes.size();
    }
    
    public int cantidadVacunasSimpleAplicadas() {
        return 0;
    }
}


