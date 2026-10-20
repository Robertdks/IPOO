import java.util.Date;
public class Persona
{
    private String dni ;
    private String nombre;
    private Date fechaDeNacimiento ;
    public Persona(String nombre, String dni, Date fecha){
        this.dni = dni ;
        this.nombre = nombre ;
        this.fechaDeNacimiento = fecha ;
    }
    public void setDni(String dni){
        this.dni = dni ;
    }
    public String getDni(){
        return this.dni ;
    }
    public void setNombre(String nombre){
        this.nombre = nombre ;
    }
    public String getNombre(){
        return this.nombre ;
    }
    public void setFechaDeNacimiento(Date fecha){
        this.fechaDeNacimiento = fecha ;
    }
}