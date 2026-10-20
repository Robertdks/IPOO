public class Pelicula extends ProduccionAudioVisual
{
    private double duracion ;
    public Pelicula(int anio, String titulo, String descripcion, double tiempo){
        super(anio,titulo,descripcion) ;
        this.duracion = tiempo ;
    }
    public void setDuracion(double tiempo){
        this.duracion = tiempo ;
    }
    public double getDuracion(){
        return this.duracion ;
    }
}