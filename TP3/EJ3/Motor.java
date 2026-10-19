
/**
 * Write a description of class Motor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Motor
{
    // instance variables - replace the example below with your own
    private String tipoDeMotor;
    private String tipoDeCombustible;
    private long numeroDeMotor;
    private int potencia ;
    public Motor()
    {
        // initialise instance variables
    }
    public void setTipoDeMotor (String tipoDeMotor){
        this.tipoDeMotor = tipoDeMotor ;
    }
    public String getTipoDeMotor(){
        return this.tipoDeMotor ;
    }
    public void setTipoDeCombustible(String tipoDeCombustible){
        this.tipoDeCombustible = tipoDeCombustible ;
    }
    public String getTipoDeCombustible(){
        return this.tipoDeCombustible ;
    }
    public void setNumeroDeMotor (long numeroDeMotor){
        this.numeroDeMotor = numeroDeMotor ;
    }
    public long getNumeroDeMotor (){
        return this.numeroDeMotor ;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia ;
    }
    public int getPotencia(){
        return this.potencia ;
    }
    
}