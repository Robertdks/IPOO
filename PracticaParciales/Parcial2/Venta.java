import java.util.Date ;
public class Venta
{
    private Date fecha ;
    private Cliente cliente ;
    private Persona vendedor ;
    private Libro libroVendido ;
    public Venta(Libro libro, Cliente cliente, Persona vendedor){
        this.cliente = cliente ;
        this.libroVendido = libro ;
        this.vendedor = vendedor ;
        this.fecha = new Date() ;
    }
    public Cliente getCliente(){
        return this.cliente ;
    }
    public Persona getVendedor(){
        return this.vendedor ;
    }
    public Libro getLibroVendido(){
        return this.libroVendido ;
    }
    public double calcularPrecio(){
        return getLibroVendido().getPrecioBase() - 
        getCliente().aplicarDescuento(getLibroVendido().getPrecioBase()) ;
    }
}