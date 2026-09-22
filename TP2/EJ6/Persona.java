
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date ;
public class Persona
{
    // instance variables - replace the example below with your own
    private long dni;
    private String nombre ;
    private String apellido ;
    private Date fechaDeNacimiento = new Date() ;
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
    public long getDni(){
        return this.dni ;
    }
    public void setDni(long dni){
        this.dni = dni ;
    }
    public String getNombre(){
        return this.nombre ;
    }
    public void setNombre(String nombre){
        this.nombre = nombre ;
    }
    public Date getFechaDeNacimiento(){
        return this.fechaDeNacimiento ;
    }
    public void seFechaDeNacimiento(Date fechaDeNacimiento){
        this.fechaDeNacimiento =  fechaDeNacimiento ;
    }
}