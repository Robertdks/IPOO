
/**
 * Write a description of class Direccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Direccion
{
    // instance variables - replace the example below with your own
    private int numero;
    private String calle ;
    private String localidad ;
    private String provincia ;
    /**
     * Constructor for objects of class Direccion
     */
    public Direccion()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getNumero(){
        return this.numero ;
    }
    public void setNumero(int numero){
        this.numero = numero ;
    }
    public String getCalle(){
        return this.calle ;
    }
    public void setCalle(String calle){
        this.calle = calle ;
    }
    public String getLocalidad(){
        return this.localidad ;
    }
    public void setLocalidad(String localidad){
        this.localidad = localidad ;
    }
    public String getProvincia(){
        return this.provincia ;
    }
}