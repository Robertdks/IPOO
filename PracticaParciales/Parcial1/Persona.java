public class Persona
{
    private String nombre ;
    private String dni ;
    public Persona(String nombre,String dni){
        this.nombre = nombre ;
        this.dni = dni;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return this.dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
}