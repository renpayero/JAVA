import java.util.Vector;

public class Personas
{
    private String nombre;
    private String apellido;
    private int DNI;
    private Vector<String> patologia = new Vector<String>();   
    private String tipoVacuna;
    private String localidad;

    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }   
    public void setApellido(String apellido){
        this.apellido=apellido;    
    }
    public String getApellido(){
        return apellido;    
    }      
    public void setDNI(int DNI){
        this.DNI=DNI;    
    }
    public int getDNI(){
        return DNI;    
    }      
    public void agregarPatologia(String patologia){
        this.patologia.add(patologia);
    }
    public void setLocalidad(String localidad){
        this.localidad=localidad;
    }
    public String getLocalidad(){
        return localidad;
    }
    public void setTipoVacuna(String tipoVacuna){
        this.tipoVacuna=tipoVacuna;
    }
    public String getTipoVacuna(){
        return tipoVacuna;
    }
    
}
