
/**
 * Write a description of class Visita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date ;
public class Visita
{
    // instance variables - replace the example below with your own
    private Date fecha ;
    private Persona visitante ;
    private ObraDeArte obraDestacada ;
    /**
     * Constructor for objects of class Visita
     */
    public Visita()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Date getFecha(){
        return this.fecha ;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha ;
    }
    public Persona getVisitante (){
        return this.visitante ;
    }
    public void setVisitante(Persona visitante){
        this.visitante = visitante ;
    }
    public ObraDeArte getObraDestacada(){
        return this.obraDestacada ;
    }
    public void setObraDestacada(ObraDeArte obraDeArte){
        this.obraDestacada = obraDeArte ;
    }
    
}