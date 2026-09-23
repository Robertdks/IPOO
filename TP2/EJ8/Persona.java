
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String dni;
    private String nombre ;
    private String email ;
    private String telefono ;
    private Direccion domicilio ;
    /**
     * Constructor for objects of class Persona
     */
    public Persona()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getDni(){
        return this.dni ;
    }
    public void setDni(String dni){
        this.dni = dni ;
    }
    public String getNombre(){
        return this.nombre ;
    }
    public void setNombre(String nombre){
        this.nombre = nombre ;
    }
    public String getEmail(){
        return this.email ;
    }
    public void setEmail(String email){
        this.email = email ;
    }
    public String getTelefono(){
        return this.telefono ;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono ;
    }
    public Direccion getDomicilio(){
        return this.domicilio ;
    }
    public void setDomicilio(Direccion domicilio){
        this.domicilio = domicilio ;
    }
}