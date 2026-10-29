import java.util.Vector ;
public class SistemaDeVenta
{
    private Vector<Libro> libros = new Vector<>() ;
    private Vector<Venta> ventas = new Vector<>() ;
    public Vector<Libro> getLibros(){
        return this.libros ;
    }
    public double precioDe(Venta venta){
        return  venta.calcularPrecio() ;
    }
    public Vector<Venta> getVentas(){
        return this.ventas ;
    }
    public double totalDeVentas(){
        double total = 0 ;
        for (Venta v : getVentas()){
            total += precioDe(v) ;
        }
        return total ;
    }
    public Venta ventaMasCara(){
        Venta venta = null  ;
        if(getVentas() != null){
            for(Venta v : getVentas()){
                if(venta == null || precioDe(v) > precioDe(venta)){
                    venta = v ;
                }
            }
        }
        return venta ;
    }
    public void addVenta(Libro libro,Cliente cliente, Persona vendedor){
        Venta nuevaVenta = new Venta(libro,cliente,vendedor) ;
        getVentas().add(nuevaVenta) ;
    }
}