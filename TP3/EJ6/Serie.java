import java.util.Vector ;
public class Serie extends ProduccionAudioVisual
{
    private Vector<Capitulo> capitulos ;
    public Serie(int anio, String titulo,String descripcion){
        super(anio,titulo,descripcion) ;
        this.capitulos = new Vector<Capitulo>() ;
    }
    public Vector<Capitulo> getCapitulos(){
        return this.capitulos ;
    }
    public void agregarCapitulo(Capitulo capitulo){
        this.capitulos.add(capitulo);
    }
    public void eliminarCapitulo(Capitulo capitulo){
        this.capitulos.remove(capitulo);
    }
    public int cantidadDeCapitulos(){
        return this.capitulos.size() ;
    }
}