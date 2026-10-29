import java.util.Date ;
import java.util.Vector ;
public abstract class CuentaBancaria
{
    private Moneda moneda ;
    private Persona titular ;
    private float saldo ;
    private Vector<Transaccion> transacciones ;
    private int limiteDeExtracciones ;
    private Date fechaDeCreacion ;
    private int cantidadDeExtracciones ;
    public CuentaBancaria(Persona titular, Moneda moneda){
        this.transacciones = new Vector<>() ;
        this.fechaDeCreacion = new Date() ;
        setSaldo(0) ;
        setLimiteDeExtracciones(10) ;
        setTitular(titular) ;
        this.cantidadDeExtracciones = 0 ;
        this.moneda = moneda ;
    }
    public void setTitular(Persona titular){
        this.titular = titular ;
    }
    public Persona getTitular(){
        return this.titular ;
    }
    public void setMoneda(Moneda moneda){
        this.moneda = moneda ;
    }
    public Moneda getMoneda(){
        return this.moneda ;
    }
    public void setSaldo(float unMonto){
        this.saldo = unMonto ;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setLimiteDeExtracciones(int limite){
        this.limiteDeExtracciones = limite ;
    }
    public int getLimiteDeExtracciones(){
        return this.limiteDeExtracciones ;
    }
    public Date getFechaDeCreacion(){
        return this.fechaDeCreacion ;
    }
    public Vector<Transaccion> getTransacciones(){
        return this.transacciones ;
    }
    public int getCantidadDeExtracciones() {
        return this.cantidadDeExtracciones ;
    }
    public void setCantidadDeExtracciones(){
        this.cantidadDeExtracciones ++ ;
    }
    public void setTransaccion(float monto, String tipo){
        Transaccion nuevo = new Transaccion(monto,tipo) ;
        getTransacciones().add(nuevo) ;
    }
    public boolean extraer(float unMonto){
        setSaldo(getSaldo() - unMonto) ;
        setTransaccion(unMonto, "Extraccion");
        setCantidadDeExtracciones() ;
        return true ;
    }
    public boolean depositar(float unMonto){
        if(unMonto > 0){
            setSaldo(getSaldo() +  unMonto);
            setTransaccion(unMonto,"Deposito") ;
            return true ;
        }
        return false ;
    }
    public float saldo(){
        return getMoneda().conversion(getSaldo()) ;
    }
    public String nombreTitular(){
        return titular.getNombre()+ " " + titular.getApellido() ;
    }
    public int cantidadDetransacciones(){
        return getTransacciones().size() ;
    }
}