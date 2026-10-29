public abstract class Viajero extends Persona {
    public Viajero(String nombre, String dni) {
        super(nombre, dni);
    }
    public abstract  double aplicarDescuento(double precioBase) ;
}