public class CajaDeAhorro extends CuentaBancaria
{
    public CajaDeAhorro(Persona titular, Moneda moneda){
        super(titular,moneda);
    }
    public boolean extraer(float unMonto){
        if(getSaldo()>= unMonto){
            return super.extraer(unMonto) ;
        }
        return false ;
    }
}