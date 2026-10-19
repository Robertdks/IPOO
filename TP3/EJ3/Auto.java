
/**
 * Write a description of class Auto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auto extends Vehiculo 
{
    private String tipoDeAuto ;
    private String traccion ;
    
    public Auto(String tipoDeAuto){
        setTipoDeAuto(tipoDeAuto) ;
    }
    public void setTipoDeAuto(String tipoDeAuto){
        this.tipoDeAuto = tipoDeAuto ;
    }
    public String getTipoDeAuto(){
        return this.tipoDeAuto ;
    }
    public void setTraccion(String traccion){
        this.traccion = traccion ;
    }
    public String getTraccion(){
        return this.traccion ;
    }
}