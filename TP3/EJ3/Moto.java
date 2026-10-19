
/**
 * Write a description of class Moto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moto extends Vehiculo
{
    private String tipo ;
    private int cilindrada ;
    public Moto(String tipo, int cilindrada)
    {
        setTipo(tipo) ;
        setCilindrada(cilindrada);
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada ;
    }
    public int getCilindrada(){
        return this.cilindrada ;
    }
    public void setTipo(String tipo){
         this.tipo  = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
}