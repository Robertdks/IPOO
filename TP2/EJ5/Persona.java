public class Persona
{
    // instance variables - replace the example below with your own
    private int edad;
    private String nombre ;
    private long dni ;
    /**
     * Constructor for objects of class Persona
     */
    public Persona()
    {
        // initialise instance variables
    }
    public void setEdad(int n){
        this.edad = n ;
    }
    private int getEdad(){
        return this.edad ;
    }
    public void setDni (long n){
        this.dni = n ;
    }
    private long getDni(){
        return this.dni; 
    }
    public void setNombre(String n){
        this.nombre = n ;
    }
    private String getNombre(){
        return this.nombre ;
    }
    public int mostrarEdad(){
        return getEdad() ;
    }
    public long mostrarDni(){
        return getDni() ;
    }
}