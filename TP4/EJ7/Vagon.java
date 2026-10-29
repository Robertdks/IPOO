public abstract class Vagon
{
    private double pesoVagon ;
    
    public Vagon(double peso){
        this.pesoVagon = peso ;
    }
    
    public void setPeso(double peso){
        this.pesoVagon = peso ;
    }
    public double getPeso(){
        return this.pesoVagon;
    }
    public abstract int cantidadDePasajeros()  ;
    
}