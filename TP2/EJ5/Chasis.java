public class Chasis
{
    // instance variables - replace the example below with your own
    private long numeroDeSerie;
    private String modelo ;
    /**
     * Constructor for objects of class Chasis
     */
    public Chasis()
    {
        // initialise instance variables
    }
    public void setModelo(String m){
        this.modelo = m ;
    }
    private String getModelo(){
        return this.modelo ;
    }
    public void setNumeroDeSerie(long n){
        this.numeroDeSerie = n ;
    }
    private long getNumeroDeSerie(){
        return this.numeroDeSerie ;
    }
    public long MostrarNumeroDeSerie(){
        return getNumeroDeSerie();
    }
    public String mostrarModelo(){
        return getModelo();
    }
}