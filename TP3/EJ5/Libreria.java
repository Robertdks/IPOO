import java.util.Vector ;
public class Libreria
{
    private Vector<Libro> libros ;
    
    public Libreria(){
        this.libros = new Vector<Libro>() ;
    }
    public void agregarUnLibro(Libro unLibro){
        this.libros.add(unLibro);
    }
    public void eliminarUnLibro(Libro unLibro){
        this.libros.remove(unLibro);
    }
    public int cantidadDeLibros(){
        return this.libros.size() ;
    }
    public int cantidadTotalDeCopias(){
        int cantidad = 0;
        for(Libro elementos : this.libros){
            cantidad = elementos.getCantidadDeCopias() + cantidad ;
        }
        return cantidad;
    }
}