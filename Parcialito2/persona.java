import java.util.ArrayList;
public class persona
{
    private vacuna miVacuna; //vacuna aplicada
    private String nombre;
    private String apellido;
    private int DNI;
    private ArrayList<String> patologia = new ArrayList<String>();   
    private localidad localidad; 

    
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
    public void setLocalidad(localidad localidad){
        this.localidad=localidad;
    }
    public localidad getLocalidad(){
        return localidad;
    
    }
    //public void aplicarVacunaSimple(persona persona, institucion institucion, laboratorio laboratorio){
    //    
    //}
}
