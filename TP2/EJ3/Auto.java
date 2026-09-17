
public class Auto
{
    // instance variables - replace the example below with your own
    private Neumatico ruedas ;
    private Persona titular ;
    private Motor motor ;
    private Chasis chasis ;
    /**
     * Constructor for objects of class Auto
     */
    public Auto(){
        
    }
    public void setNeumatico(Neumatico ruedas){
        this.ruedas = ruedas;
    }
    public void setPersona(Persona titular){
        this.titular = titular;
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    public void setChasis(Chasis chasis){
        this.chasis = chasis ;
    }
    public Neumatico getRuedas(){
        return this.ruedas ;
    }
    public Persona getTitular(){
        return this.titular ;
    }
    public Motor getMotor(){
        return this.motor ;
    }
    public Chasis getChasis(){
        return this.chasis ;
    }
}