
/**
 * Write a description of class ControlRemote here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlRemote 
{
    // instance variables - replace the example below with your own
    private AireAcondicionado aire ;
    /**
     * Constructor for objects of class ControlRemote
     */
    public ControlRemote()
    {
        // initialise instance variables
        this.aire = aire ;
    }
    public void setAire(AireAcondicionado aire){
        this.aire = aire ;
    }
    public void subirTemp(){
        this.aire.subirTemp() ;
    }
    public void bajarTemp(){
        this.aire.bajarTemp() ;
    }
    public void apagar(){
        this.aire.apagar();
    }
    public void encender(){
        this.aire.encender() ;
    }
    public void cambiarModo(String modo){
        this.aire.cambiarModo(modo) ;
    }
}