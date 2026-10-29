import java.util.Date ;
public class Transaccion
{
    private float monto ;
    private Date fecha ;
    private String tipoDeTransaccion ;
    public Transaccion(float monto, String tipo){
        this.monto = monto ;
        this.fecha = new Date() ;
        this.tipoDeTransaccion = tipo;
    }
    public void setMonto(float monto){
        this.monto = monto;
    }
    public float getMonto(){
        return this.monto;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha ;
    }
    public Date getFecha(){
        return this.fecha ;
    }
    public void setTipoDeTransaccion(String tipo){
        this.tipoDeTransaccion = tipo ;
    }
    public String getTipoDeTransaccion(){
        return this.tipoDeTransaccion ;
    }
}