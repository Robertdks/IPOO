public class CuentaCorriente extends CuentaBancaria
{
       public CuentaCorriente(Persona titular){
        super(titular);
        }
    public boolean extraer(float unMonto){
        if(getLimiteDeExtracciones() > getCantidadDeExtracciones()){
            return super.extraer(unMonto) ;
        }
        return false ;
    }
}