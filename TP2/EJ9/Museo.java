
/**
 * Write a description of class Museo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Museo
{
    // instance variables - replace the example below with your own
    private String nombre ;
    private Persona director ;
    private Direccion direccion ;
    private ObraDeArte obraDeArte ;
    private String ciudad  ;
    /**
     * Constructor for objects of class Museo
     */
    public Museo()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombre(){
        return this.nombre ;
    }
    public void setNombre(String nombre){
        this.nombre = nombre ;
    }
    public Persona getDirector(){
        return this.director ;
    }
    public void setDirector(Persona director){
        this.director = director ;
    }
    public ObraDeArte getObraDeArte(){
        return this.obraDeArte ;
    }
    public void setObraDeArte(ObraDeArte obra){
        this.obraDeArte = obra ;
    }
    public String getCiudad(){
        return this.ciudad ;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad ;
    }
}