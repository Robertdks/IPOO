import java.util.Vector ;
public abstract class  ProduccionAudioVisual
{
    private Vector<Persona> directores ;
    private Vector<Persona> actores ;
    private String titulo ;
    private String descripcion ;
    private int anioDeEstreno ;
    
    public ProduccionAudioVisual(int anio, String  titulo, String descripcion){
        this.directores = new Vector<Persona>();
        this.actores = new Vector<Persona>() ;
        this.titulo = titulo;
        this.anioDeEstreno = anio ;
        this.descripcion = descripcion ;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo ;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion ;
    }
    public String getDescripcion(){
        return this.descripcion ;
    }
    public void setAnioDeEstreno(int anio){
        this.anioDeEstreno = anio ;
    }
    public int getAnioDeEstreno(){
        return this.anioDeEstreno ;
    }
    public void agregarUnActor(Persona actor){
        this.actores.add(actor) ;
    }
    public void eliminarUnActor(Persona actor){
        this.actores.remove(actor);
    }
    public void agregarUnDirector(Persona director){
        this.directores.add(director) ;
    }
    public void eliminarUnDirector(Persona director){
        this.directores.remove(director) ;
    }
    public Vector<Persona> getDirectores(){
        return this.directores ;
    }
    public Vector<Persona> getActores(){
        return this.actores ;
    }
}