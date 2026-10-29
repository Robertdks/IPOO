import java.util.Vector ;
public class SistemaDeReserva
{
    private Vector <Reserva> reservas = new Vector<>() ;
    private String nombre ;
    public String getNombre() {
    return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Vector<Reserva> getReservas() {
    return this.reservas;
    }
    public void setReservas(Vector<Reserva> reservas) {
        this.reservas = reservas;
    }
    public void addReserva(Persona agente, Paquete paquete,Viajero viajero){
         Reserva nuevaReserva = new Reserva(agente,paquete,viajero) ;
         this.reservas.add(nuevaReserva) ;
    }
    public double precioDeReserva(Reserva reserva){
        return reserva.calcularPrecio() ;
    }
    public double montoTotalDeReservas(){
        double total = 0 ;
        for(Reserva r : getReservas()){
            total += precioDeReserva(r) ;
        }
        return total ;
    }
    public Vector<Paquete> paquetesInternacionales(){
        Vector paqueteInternacionales = new Vector<Paquete>() ;
        for(Reserva r : getReservas()){
            if(r.getPaquete().esInternacional()){
                paqueteInternacionales.add(r.getPaquete()) ;
            }
        }
        return paqueteInternacionales ;
    }
}