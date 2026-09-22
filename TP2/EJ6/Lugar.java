
/**
 * Write a description of class Lugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lugar
{
    // instance variables - replace the example below with your own
    private int numero;
    private String departamento ;
    private String calle ;
    private String localidad ;
    private String provincia ;
    /**
     * Constructor for objects of class Lugar
     */
    public Lugar()
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
    public String getDepartamento(){
        return this.departamento ;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento ;
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
    public void setProvincia(String provincia){
        this.provincia = provincia ;
    }
    public String getCalle(){
        return this.calle ;
    }
    public void setCalle(String calle){
        this.calle = calle ;
    }
    public String direccionCompleta(){
        return getNumero()+" "+getCalle()+" "+getLocalidad()+" "+getProvincia();
    }
}