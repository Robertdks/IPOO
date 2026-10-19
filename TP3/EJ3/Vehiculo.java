
/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehiculo
{
    private Motor motor ;
    private Marca marca ;
    private String color ;
    private int cantidadDeRuedas ;
    private boolean encendido = false ;
    private int velocidadMax ;
    private int velocidadActual  = 0;
    
    public void setMotor(Motor motor){
        this.motor = motor ;
    }
    public Motor getMotor(){
        return this.motor ;
    }
    public void setModelo(Marca marca){
        this.marca = marca;
    }
    public Marca getMarca(){
        return this.marca;
    }
    public void setColor(String color){
        this.color  = color ;
    }
    public String getColor(){
        return this.color ;
    }
    public void setCantidadDeRuedas(int cantidad){
        this.cantidadDeRuedas = cantidad ;
    }
    public int getCantidadDeRuedas(){
        return this.cantidadDeRuedas;
    }
    private void setEncendido(boolean estado){
        this.encendido = estado ;
    }
    public boolean getEncendido(){
        return this.encendido ;
    }
    public void setVelocidadMax(int velocidad){
        this.velocidadMax = velocidad ;
    }
    public int getVelocidadMax(){
        return this.velocidadMax ;
    }
    public void setVelocidadActual(int n){
        this.velocidadActual = velocidadActual + n ;
    }
    public int getVelocidadActual(){
        return this.velocidadActual ;
    }
    public void encender(){
        setEncendido(true) ;
    }
    public void apagar(){
        if(getEncendido()){
            setEncendido(false) ;
        }
    }
    public void acelerar(int velocidad){
        if (getVelocidadMax() < getVelocidadActual()){
            while (getVelocidadActual() <= velocidad){
                setVelocidadActual(1) ;
            }
        }
    }
    public void desacelerar(int velocidad){
        if(getVelocidadActual()>= velocidad){
            while(getVelocidadActual() >= velocidad){
                setVelocidadActual(-1) ;
            }
        }
    }
}