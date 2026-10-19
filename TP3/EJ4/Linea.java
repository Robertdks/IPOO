
/**
 * Write a description of class linea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Linea extends Figura
{
    private Punto a ;
    private Punto b ;
    private double longitud ;
    public Linea(Punto a, Punto b){
        this.a = a ;
        this.b = b ;
    }
    public double area(){
        return 0 ;
    }
    public void pintar(String color){
        setColor(color);        
    }
    public double longitud (){
        return a.distancia(a,b); 
    }
}