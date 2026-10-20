public class Personaje
{
    private String nombre ;
    private String rol ;
    private String descripcion ;
    public Personaje(String nombre, String rol, String descripcion){
        this.nombre = nombre ;
        this.rol  = rol ;
        this.descripcion = descripcion ;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre ;
    }
    public String getNombre(){
        return this.nombre ;
    }
    public void setRol(String rol){
        this.rol = rol ;
    }
    public String getRol(){
        return this.rol ;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion ;
    }
    public String getDescripcion(){
        return this.descripcion ;
    }
}