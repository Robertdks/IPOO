
/**
 * Write a description of class Tarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date ; 
public class Tarea
{
    // instance variables - replace the example below with your own
    private int prioridad;
    private String descripcion ;
    private Date fechaDeVencimiento ;
    private Persona responsable ;
    private boolean estado ;
    /**
     * Constructor for objects of class Tarea
     */
    public Tarea()
    {
        estado = false ;
        prioridad = 0 ;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getPrioridad(){
        return this.prioridad ;
    }
    public void setPrioridad( int prioridad){
        this.prioridad = prioridad;
    }
    public String getDescripcion(){
        return this.descripcion ;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion ;
    }
    public Date getFechaDeVencimiento(){
        return this.fechaDeVencimiento ;
    }
    public void setFechaDeVencimiento(Date fecha){
        this.fechaDeVencimiento = fecha ;
    }
    public Persona getResponsable(){
        return this.responsable ;
    }
    public void setResponsable(Persona responsable){
        this.responsable = responsable ;
    }
    public boolean getEstado(){
        return this.estado ;
    }
    public void setEstado(boolean estado){
        this.estado = estado ;
    }
}