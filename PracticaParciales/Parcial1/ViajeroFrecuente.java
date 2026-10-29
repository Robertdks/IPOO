public class ViajeroFrecuente extends Viajero
{
    public ViajeroFrecuente(String nombre, String dni){
        super(nombre,dni) ;
    }
    public double aplicarDescuento(double precioBase){
        return precioBase * 0.10f ;
    }
}