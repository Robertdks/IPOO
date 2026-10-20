import java.util.Date;
public class Persona
{
    private Date fechaDeNacimiento  ;
    private String dni ;
    private String nombre;
    
    public Persona(Date fecha, String dni, String nombre){
        this.fechaDeNacimiento = fecha;
        this.dni = dni ;
        this.nombre = nombre ;
    }
    
    public void setFechaDeNacimiento(Date fecha){
        this.fechaDeNacimiento = fecha;
    }
    public Date getFechaDeNacimiento(){
        return this.fechaDeNacimiento ;
    }
    public void setDni(String dni){
        this.dni = dni ;
    }
    public String getDni(){
        return this.dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre ;
    }
    public String getNombre(){
        return this.nombre ;
    }
}