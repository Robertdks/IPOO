public class ViajeroCorporativo extends Viajero
{ 
    public ViajeroCorporativo(String nombre, String  dni){
        super(nombre,dni) ;
    }
    public double aplicarDescuento(double precioBase){
        return precioBase * 0.20f ;
    }
}