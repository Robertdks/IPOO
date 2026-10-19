
/**
 * Write a description of class rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo extends Figura
{
    private double largo ;
    private double alto ;
    public Rectangulo(double largo, double alto){
        this.largo = largo ;
        this.alto = alto ;
    }
    public void setLargo(double largo){
        this.largo = largo ;
    }
    public double getLargo(){
        return this.largo ;
    }
    public void setAlto(double alto){
        this.alto = alto ;
    }
    public double getAlto(){
        return this.alto ;
    }
    public double area(){
        return getLargo() * getAlto() ;
    }
    public void pintar(String color){
        setColor(color) ;
    }
}