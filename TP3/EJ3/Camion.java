
/**
 * Write a description of class Camion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends Vehiculo
{
    private float tara ;
    private float largo ;
    public Camion(float tara, float largo)
    {
        setTara(tara) ;
        setLargo(largo);
    }
    
    public void setTara(float tara){
        this.tara = tara ;
    }
    public float getTara(){
        return this.tara ;
    }
    public void setLargo(float largo){
        this.largo = largo ;
    }
    public float getLargo(){
        return this.largo ;
    }
}