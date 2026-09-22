
/**
 * Write a description of class Cita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date ;
public class Cita
{
    // instance variables - replace the example below with your own
    private int importancia;
    private Date fecha = new Date();
    private boolean confirmado ;
    private Persona contacto ;
    private Lugar direccion ;
    /**
     * Constructor for objects of class Cita
     */
    public Cita()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getImportancia(){
        return this.importancia ;
    }
    public void setImportancia(int importancia){
        this.importancia = importancia ;
    }
    public boolean getConfirmado(){
        return this.confirmado;
    }
    public void setConfirmado(){
        if (getConfirmado()){
            this.confirmado = false ;
        }
        this.confirmado = true ;
    }
    public Persona getContacto(){
        return this.contacto ;
    }
    public void setContacto(Persona p){
        this.contacto = p ;
    }
    public Lugar getDireccion(){
        return this.direccion ;
    }
    public void setDireccion(Lugar direccion){
        this.direccion = direccion ;
    }
}