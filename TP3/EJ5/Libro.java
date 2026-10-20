import java.util.Vector ;
import java.util.Date ;
public class Libro
{
    private Vector<Personaje> personajes ;
    private Date anioDeLanzamiento ;
    private String titulo ;
    private String autor ;
    private int cantidadDeCopias ;
    
    public Libro(int cantidad, Date anioDeLanzamiento, String titulo, String autor){
        this.personajes = new Vector<Personaje>();
        this.cantidadDeCopias = cantidad;
        this.anioDeLanzamiento = anioDeLanzamiento ;
        this.titulo = titulo ;
        this.autor = autor ;
    }
    public void agregarPersonaje(Personaje personaje){
        this.personajes.add(personaje) ;
    }
    public void eliminarPersonaje(Personaje personaje){
        this.personajes.remove(personaje);
    }
    public int cantidadDePersonajes(){
        return this.personajes.size();
    }
    public void setAnioDeLanzamiento(Date anio){
        this.anioDeLanzamiento = anio ;
    }
    public Date getAnioDeLanzamiento(){
        return this.anioDeLanzamiento ;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo ;
    }
    public String getTitulo(){
        return this.titulo ;
    }
    public void setAutor(String autor){
        this.autor = autor ;
    }
    public String getAutor(){
        return this.autor ;
    }
    public void setCantidadDeCopias(int cantidad){
        this.cantidadDeCopias = cantidad ;
    }
    public int getCantidadDeCopias(){
        return this.cantidadDeCopias ;
    }
    
}