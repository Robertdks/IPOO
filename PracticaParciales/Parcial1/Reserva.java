import java.util.Date ;
public class Reserva
{
    private Paquete paquete ;
    private Viajero viajero ;
    private Date fecha ;
    private Persona agente ;
    public Reserva(Persona agente,Paquete paquete, Viajero viajero){
        this.paquete = paquete ;
        this.agente = agente ;
        this.viajero = viajero ;
        this.fecha = new Date() ;
    }
    public Date getFecha() {
        return this.fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Paquete getPaquete() {
        return this.paquete;
    }
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
    public Viajero getViajero() {
        return this.viajero;
    }
    public void setViajero(Viajero viajero) {
        this.viajero = viajero;
    }
    public Persona getAgente() {
        return this.agente;
    }
    public void setAgente(Persona agente) {
        this.agente = agente;
    }
    public double calcularPrecio(){
        return getPaquete().tasaDeRecargo() + getPaquete().getPrecioBase() -
        getViajero().aplicarDescuento(getPaquete().getPrecioBase());
    }
}