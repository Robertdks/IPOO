
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo
{
    // instance variables - replace the example below with your own
    private int radio;
    private Punto centro ;
    /**
     * Constructor for objects of class Circulo
     */
    public Circulo()
    {
        // initialise instance variables
        radio = 0 ;
        Punto punto = new Punto() ;
    }
    public int getRadio(){
        return this.radio ;
    }
    public void setRadio(int r){
        this.radio = r ;
    }
    public Punto getCentro(){
        return this.centro ;
    }
    public void setCentro(Punto p){
        this.centro = p ;
    }
    public void ampliar(int n){
        setRadio(getRadio () + n);
    }
    public double area(){
        return Math.PI*Math.pow(getRadio(), 2) ;
    }
    public void transladar(Punto p){
        setCentro(p); 
    }
}