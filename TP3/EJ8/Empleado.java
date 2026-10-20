public abstract class  Empleado
{
    private Persona persona ;
    private double salarioBasico ;
    public Empleado(Persona persona, double salario){
        this.persona = persona ;
        this.salarioBasico = salario;
    }
    public void setPersona(Persona persona){
        this.persona = persona ;
    }
    public Persona getPersona(){
        return this.persona;
    }
    public void setSalarioBasico(double salario){
        this.salarioBasico = salario;
    }
    public double getSalarioBasico(){
        return this.salarioBasico ;
    }
    public abstract double salario();
}