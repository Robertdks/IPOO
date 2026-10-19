
/**
 * Write a description of class Album here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Vector;
public class Album
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Vector<Foto> fotos ;
    /**
     * Constructor for objects of class Album
     */
    public Album()
    {
        // initialise instance variables
        this.fotos = new Vector<Foto>() ;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre ;
    }
    public String getNombre(){
        return this.nombre ;
    }
    public void agregarFoto(Foto unaFoto){
        this.fotos.add(unaFoto) ;
    }
    public void agregarFotos(Vector <Foto> fotos){
        this.fotos.addAll(fotos) ;
    }
    public void eliminarFoto(Foto unaFoto){
        this.fotos.remove(unaFoto);
    }
    public int cantidadFotos(){
        return this.fotos.size() ;
    }
    public void limpiarAlbum(){
        this.fotos.clear() ;
    }
}