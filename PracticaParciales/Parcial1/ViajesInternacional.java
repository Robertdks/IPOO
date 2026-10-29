public class ViajesInternacional extends Paquete
{
    public double tasaDeRecargo(){
        return  getPrecioBase()*0.20f ;
    }
    public boolean esInternacional(){
        return true ;
    }
}