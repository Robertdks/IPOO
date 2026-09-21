
/**
 * Write a description of class Punto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    /**
     * Constructor for objects of class Punto
     */
    public Punto()
    {
        // initialise instance variables
        x = 0;
        y = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getX(){
        return this.x ;
    }
    public int getY(){
        return this.y ;
    }
    public void setX(int x){
        this.x = x ;
    }
    public void setY(int y){
        this.y = y ;
    }
    public void sumarValor(){
        sumarValor(1) ;
    }
    public void sumarValor(int n){
        setX(getX() + n) ;
        setY(getY() + n) ;
    }
    public void sumarPunto(Punto p){
        setX(getX() + p.getX() ) ;
        setY(getY() + p.getY() ) ;
    }
    public double distanciaDe(Punto p){
        return Math.sqrt(Math.pow(getX() - p.getX(), 2) + (Math.pow(getY() - p.getY(),2))) ;
    }
    public double distanciaOrigen(){
        Punto origen = new Punto() ;
        return distanciaDe(origen) ;
    }
}