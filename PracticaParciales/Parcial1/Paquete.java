public abstract class Paquete
{
    private String destino ;
    private int duracion ;
    private double precioBase ;
    public String getDestino() {
        return this.destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public int getDuracion() {
        return this.duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public double getPrecioBase() {
        return this.precioBase;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public abstract double tasaDeRecargo() ;
    public boolean esInternacional(){
        return false ;
    }
}