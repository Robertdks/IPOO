public class CajaDeAhorro extends CuentaBancaria
{
    public CajaDeAhorro(Persona titular){
        super(titular);
    }
    public boolean extraer(float unMonto){
        if(getSaldo()>= unMonto){
            return super.extraer(unMonto) ;
        }
        return false ;
    }
}