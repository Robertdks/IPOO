
/**
 * Write a description of class Punto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto
{
    private double x ;
    private double y ;
    public Punto(double x, double y){
        this.x = x;
        this.y = y ;
    }
    public void setX(double x){
        this.x = x ;
    }
    public double getX(){
        return this.x ;
    }
    public void setY(double y){
        this.y = y ;
    }
    public double getY(){
        return this.y ;
    }
    public double distancia(Punto a, Punto b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + (Math.pow(a.getY() - b.getY(),2))) ;
    }
}