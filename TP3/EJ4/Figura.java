public abstract class Figura
{
    protected String color ;
    
    public void setColor(String color){
        this.color = color ;
    }
    public String getColor(){
        return this.color ;
    }
    public abstract double area();
    public abstract void pintar(String color);
}