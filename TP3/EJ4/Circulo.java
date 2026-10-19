public class Circulo extends Figura
{
    private double radio ;
    private Punto centro ;
    public Circulo(double radio, Punto centro){
        this.radio = radio ;
        this.centro = centro ;
    }
    public void setRadio(double radio){
        this.radio = radio ;
    }
    public double getRadio(){
        return this.radio ;
    }
    public void setCentro(Punto centro){
        this.centro = centro ;
    }
    public Punto getCentro(){
        return this.centro ;
    }
    public double area(){
        return Math.PI*Math.pow(getRadio(), 2);
    }
    public void pintar(String color){
        setColor(color) ;
    }
}