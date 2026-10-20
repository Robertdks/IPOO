import java.util.Set ;
import java.util.HashSet;
public class Conjunto
{
    private Set<Persona> personas;
    public Conjunto(){
        this.personas = new HashSet<Persona>();
    }
    public Set<Persona> getPersonas(){
        return this.personas;
    }
    public void agregarElemento(Persona unElemento){
        this.personas.add(unElemento);
    }
    public void eliminarElemento(Persona unElemento){
        this.personas.remove(unElemento);
    }
    public Conjunto union(Conjunto unConjunto){
        Conjunto resultado = new Conjunto() ;
        resultado.personas.addAll(getPersonas());
        resultado.personas.addAll(unConjunto.getPersonas());
        return resultado ;
    }
    public Conjunto intereccion(Conjunto unConjunto){
        Conjunto resultado = new Conjunto ();
        for(Persona p : getPersonas()){
            if (unConjunto.getPersonas().contains(p)) {
                resultado.agregarElemento(p);
            }
        }
        return resultado ;
    }
    public Conjunto diferencia(Conjunto unConjunto){
        Conjunto resultado = new Conjunto() ;
        for(Persona p : getPersonas()){
            if(unConjunto.getPersonas().contains(p)== false){
                resultado.agregarElemento(p);
            }
        }
        return resultado ;
    }
}