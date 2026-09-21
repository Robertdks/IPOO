
/**
 * Write a description of class AireAcondicionado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AireAcondicionado
{
    // instance variables - replace the example below with your own
    private int tempMax;
    private int tempMin ;
    private int tempActual ;
    private boolean estado ;
    private String modo ;
    private ControlRemote control ;
        /**
     * Constructor for objects of class AireAcondicionado
     */
    public AireAcondicionado()
    {
        // initialise instance variables
        tempMax = 31;
        tempMin = 18 ;
        tempActual =21 ;
        estado = false ;
        modo = "normal" ;
        control = control ;
    }
    public int getTempActual(){
        return this.tempActual ;
    }
    public void setTempActual(int n){
        this.tempActual = getTempActual() +  n;
    }
    public void setControlRemoto(ControlRemote control){
         this.control = control ;
    }
    public void setModo(String modo){
        this.modo = modo ;
    }
    public String getModo(){
        return this.modo ;
    }
    public boolean getEstado(){
        return this.estado ;
    }
    public void setEstado(boolean estado){
        this.estado = estado ;
    }
    public int getTempMax(){
        return this.tempMax ;
    }
    public int getTempMin(){
        return this.tempMin ;
    }
    public void subirTemp(){
        if(getEstado() != false && getTempActual() < getTempMax()){
            setTempActual(1) ;
        }
    }
    public void bajarTemp(){
        if(getEstado() != false && getTempActual() > getTempMin()){
            setTempActual(-1) ;
        }
    }
    public void encender(){
        if(getEstado() != true){
            setEstado(true) ;
        }
    }
    public void apagar (){
        if(getEstado()){
            setEstado(false) ;
        }
    }
    public void cambiarModo(String modo){
        if (modo == "TempMax" && getEstado() != false){
             while (getTempActual() != getTempMax()){
                subirTemp() ;
            }
            setModo("TempMax") ;
        }
        if (modo == "TempMin" && getEstado() != false){
            while(getTempActual() != getTempMin()){
                bajarTemp() ;
                setModo("TempMin") ;
            }
        }
        if (modo == "normal" && getEstado() != false){
            if (getModo() == "TempMax"){
                while (getTempActual() != 21){
                    bajarTemp() ;
                }
            }
            else{
                while(getTempActual() != 21){
                    subirTemp() ;
                }
            }
            setModo("normal") ;
        }
    }
}