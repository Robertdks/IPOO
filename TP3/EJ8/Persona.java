public class Persona
{
    private String dni ;
    private String nombre ;
    private Direccion direccion;
    private String sexo ;
    private int anioDeNacimiento ;
    
    public Persona(String dni, String nombre, Direccion direccion, String sexo, int anio){
        this.dni = dni ;
        this.nombre  = nombre ;
        this.direccion = direccion ;
        this.sexo = sexo;
        this.anioDeNacimiento = anio;
    }
    public void setDn(String dni){
        this.dni = dni;
    }
    public String getDni(){
        return this.dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre ;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }
    public Direccion getDireccion(){
        return this.direccion ;
    }
    public void setSexo(String sexo){
        this.sexo = sexo ;
    }
    public String getSexo(){
        return this.sexo ;
    }
    public void setAnioDeNacimiento(int anio){
        this.anioDeNacimiento = anio;
    }
    public int getAnioDeNacimiento(){
        return this.anioDeNacimiento;
    }
}