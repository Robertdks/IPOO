
/**
 * Write a description of class Colectivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Colectivo extends Vehiculo

{
    private int cantidadDeAsientos ;
    private String distancia ;
    public Colectivo(int cantidad , String distancia)
    {
        setCantidadDeAsientos(cantidad);
        setDistancia(distancia);
    }
    public void setCantidadDeAsientos(int cantidad){
        this.cantidadDeAsientos = cantidad ;
    }
    public int getCantidadDeAsientos(){
        return this.cantidadDeAsientos ;
    }
    public void setDistancia(String distancia){
        this.distancia = distancia ;
    }
    public String getDistancia(){
        return this.distancia ;
    }
}