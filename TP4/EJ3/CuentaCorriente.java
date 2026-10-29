public class CuentaCorriente extends CuentaBancaria
{
       public CuentaCorriente(Persona titular, Moneda moneda){
        super(titular,moneda);
        }
    public boolean extraer(float unMonto){
        if(getLimiteDeExtracciones() > getCantidadDeExtracciones()){
            return super.extraer(unMonto) ;
        }
        return false ;
    }
}