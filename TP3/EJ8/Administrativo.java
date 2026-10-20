public class Administrativo extends Empleado
{
    private int categoria;
    private int antiguedad;
    public Administrativo(Persona p, double salario, int categoria, int antiguedad){
        super(p,salario);
        this.categoria = categoria;
        this.antiguedad = antiguedad ;
    }
    public void setAntiguedad(int n){
        this.antiguedad = n;
    }
    public int getAntiguedad(){
        return this.antiguedad;
    }
    public void setCategoria(int n){
        this.categoria = n ;
    }
    public int getCategoria(){
        return this.categoria;
    }
    public double salario(){
        return getSalarioBasico()*getCategoria() + getSalarioBasico()*getAntiguedad();
    }
}
