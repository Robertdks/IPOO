
/**
 * Write a description of class Guitarra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guitarra
{
    // instance variables - replace the example below with your own
    private int precio;
    private String color ;
    private String modelo ;
    private String tipoDeGuitarra ;
    private String materialDeConstruccion ;
    private Marca marca ;
    private int cantDeCuerdas ;
    /**
     * Constructor for objects of class Guitarra
     */
    public Guitarra()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getPrecio(){
        return this.precio ;
    }
    public void setPrecio(int p){
        this.precio = p ;
    }
    public String getColor(){
        return this.color ;
    }
    public void setColor(String color){
        this.color = color ;
    }
    public String getModelo(){
        return this.modelo ;
    }
    public void setModelo(String modelo){
        this.modelo = modelo ;
    }
    public String getTipoDeGuitarra(){
        return this.tipoDeGuitarra ;
    }
    public void setTipoDeGuitarra(String tipo){
        this.tipoDeGuitarra = tipo ;
    }
    public String getMaterialDeConstruccion(){
        return this.materialDeConstruccion ;
    }
    public void setMaterialDeConstruccion(String material){
        this.materialDeConstruccion = material ;
    }
    public Marca getMarca(){
        return this.marca ;
    }
    public void setMarca(Marca m){
        this.marca = m ;
    }
    public int getCantCuerdas(){
        return this.cantDeCuerdas ;
    }
    public void setCantCuerdas(int cant){
        this.cantDeCuerdas = cant ;
    }
}