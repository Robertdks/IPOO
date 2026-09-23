
/**
 * Write a description of class Marca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marca
{
    // instance variables - replace the example below with your own
    private String fabricante;
    private String origen ;
    /**
     * Constructor for objects of class Marca
     */
    public Marca()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getFabricante(){
        return this.fabricante ;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante ;
    }
    public String getOrigen(){
        return this.origen ;
    }
    public void setOrigen(String origen){
        this.origen = origen ;
    }
}