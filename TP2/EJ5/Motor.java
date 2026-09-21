public class Motor
{
    // instance variables - replace the example below with your own
    private int potencia;
    private String tipoDeCombustible ;
    private String tipoDeMotor ;
    /**
     * Constructor for objects of class Motor
     */
    public Motor()
    {
        // initialise instance variables
    }
    public  void setPotencia(int n){
        this.potencia = n;
    }
    public void setTipoDeMotor(String m){
        this.tipoDeMotor = m;
    }
    public void setTipoDeCombustible(String c){
        this.tipoDeCombustible = c;
    }
    public int getPotencia(){
        return this.potencia;
    }
    public String getTipoDeMotor(){
        return this.tipoDeMotor;
    }
    public String getTipoDeCombustible(){
        return this.tipoDeCombustible;
    }
     
}