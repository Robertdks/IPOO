
/**
 * Write a description of class triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends Figura
{
    private double base ;
    private double altura;
    public Triangulo(double base, double altura){
        this.base = base ;
        this.altura = altura ;
    }
    public void setBase(double base){
        this.base = base ;
    }
    public double getBase(){
        return this.base ;
    }
    public void setAltura(double altura){
        this.altura = altura ;
    }
    public double getAltura(){
        return this.altura ;
    }
    public double area(){
        return (getBase()*getAltura())/2 ;
    }
    public void pintar(String color){
        setColor(color);
    }
}