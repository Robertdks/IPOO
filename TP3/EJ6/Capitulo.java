public class Capitulo
{
    private int numeroDeCapitulo = 0 ;
    private String nombreDeCapitulo ;
    public Capitulo(int numero , String nombreDeCapitulo){
        this.numeroDeCapitulo = numero ;
        this.nombreDeCapitulo = nombreDeCapitulo ;
    }
    public void setNumeroDeCapitulo(int numero){
        this.numeroDeCapitulo  =  numero ;
    }
    public int getNumeroDeCapitulo(){
        return this.numeroDeCapitulo ;
    }
    public void setNombreDeCapitulo(String nombre){
        this.nombreDeCapitulo = nombre ;
    }
    public String getNombreDeCapitulo(){
        return this.nombreDeCapitulo ;
    }
}