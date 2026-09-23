
/**
 * Write a description of class obraDeArte here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObraDeArte
{
    // instance variables - replace the example below with your own
    private String titulo ;
    private Persona autor ;
    private String tipoDeObra ;
    /**
     * Constructor for objects of class obraDeArte
     */
    public ObraDeArte()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getTitulo(){
        return this.titulo ;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo ;
    }
    public String getTipoDeObra(){
        return this.tipoDeObra ;
    }
    public void setTipoDeObra(String tipoDeObra){
        this.tipoDeObra = tipoDeObra ;
    }
    public Persona getAutor(){
        return this.autor ;
    }
    public void setAutor(Persona autor){
        this.autor = autor ;
    }
}