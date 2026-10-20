public class Tecnico extends Empleado
{
    private String titulo ;
    public Tecnico(String titulo, Persona persona, double salario){
        super(persona,salario);
        this.titulo = titulo ;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo ;
    }
    public String getTitulo(){
        return this.titulo ;
    }
    public double salario(){
        return getSalarioBasico();
    }
}