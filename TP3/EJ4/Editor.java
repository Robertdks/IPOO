import java.util.Vector ;
public class Editor
{
    private Vector <Figura> figuras ;
    public  Editor(){
        this.figuras = new Vector<Figura>();
    }
    public void pintar(String color){
        for(Figura elementos : figuras){
            elementos.pintar(color) ;
        }
    }
    public double area(){
        double aux = 0;
        for (Figura elementos : figuras){
            aux = aux + elementos.area() ;
        }
        return aux ;
    }
    public void agregarFigura(Figura figura){
        this.figuras.add(figura) ;
    }
    public void eliminarFigura(Figura figura){
        this.figuras.remove(figura);
    }
}