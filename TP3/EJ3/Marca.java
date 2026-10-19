
/**
 * Write a description of class Modelo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marca
{
    // instance variables - replace the example below with your own
    private String modelo;
    /**
     * Constructor for objects of class Modelo
     */
    public Marca(String modelo)
    {
        setModelo(modelo);
    }
    public void setModelo(String modelo){
        this.modelo = modelo ;
    }
    public String getMarca(){
        return this.modelo ;
    }
}