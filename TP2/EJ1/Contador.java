public class Contador
{
    // instance variables - replace the example below with your own

    private int tiempo;
    //get y set
    
    public int getContador(){
        return this.tiempo ;
    }
    private void setContador(int  n){
        this.tiempo = getContador() + n ; 
    }
     // Metodos
    public void iniciar(){
             iniciar(0) ;
         }
    public void iniciar(int n){
             setContador(n) ;
         }
    public void sumar(){
             sumar(1) ;
         }
    public void restar(){
             restar(1) ;
         }
    public void sumar(int n){
             setContador(n) ;
         }
    public void restar(int n){
             setContador(-n) ;
         }
}
