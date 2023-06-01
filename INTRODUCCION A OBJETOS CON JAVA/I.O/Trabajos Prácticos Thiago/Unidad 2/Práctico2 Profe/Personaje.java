public class Personaje
{
    private Actor actor;
    private String personaje;
    
    public Personaje(Actor actor, String personaje)
    {
        this.actor = actor;
        this.personaje = personaje;
    }
    
    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
       this.actor = actor;
    }

    public String getPersonaje() {
        return personaje;
    }
    public void setPersonaje(String personaje) {
       this.personaje = personaje;
    }
   
}
