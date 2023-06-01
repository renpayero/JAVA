import java.util.Date;
public class reserva
{
    private peliculas pelicula;
    private socios socio;
    private Date fechaDeReserva;

//Start GetterSetterExtension Source Code

    /**GET Method Propertie pelicula*/
    public peliculas getPelicula(){
        return this.pelicula;
    }//end method getPelicula

    /**SET Method Propertie pelicula*/
    public void setPelicula(peliculas pelicula){
        this.pelicula = pelicula;
    }//end method setPelicula

    /**GET Method Propertie socio*/
    public socios getSocio(){
        return this.socio;
    }//end method getSocio

    /**SET Method Propertie socio*/
    public void setSocio(socios socio){
        this.socio = socio;
    }//end method setSocio

    /**GET Method Propertie fechaDeReserva*/
    public Date getFechaDeReserva(){
        return this.fechaDeReserva;
    }//end method getFechaDeReserva

    /**SET Method Propertie fechaDeReserva*/
    public void setFechaDeReserva(Date fechaDeReserva){
        this.fechaDeReserva = fechaDeReserva;
    }//end method setFechaDeReserva

//End GetterSetterExtension Source Code


}//End class