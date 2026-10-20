import java.util.Set;
import java.util.HashSet ;
public class Empresa
{
    private Set<Empleado> empleados ;
    private String nombre ;
    public Empresa(String nombre){
        this.nombre = nombre ;
        this.empleados = new HashSet<Empleado>();
    }
    public Set<Empleado> getEmpleados(){
        return this.empleados;
    }
    public void setNombre(String nombre){
        this.nombre = nombre ;
    }
    public String getNombre(){
        return this.nombre ;
    }
    public void agregarEmpleado(Empleado unEmpleado){
        this.empleados.add(unEmpleado);
    }
    public void eliminarEmpleado(Empleado unEmpleado){
        this.empleados.remove(unEmpleado);
    }
    public int totalDeEmpleados(){
        return this.empleados.size();
    }
    public double montoTotal(){
        double aux = 0 ;
        for(Empleado p : getEmpleados()){
            aux  = aux + p.salario() ;
        }
        return aux ;
    }
}