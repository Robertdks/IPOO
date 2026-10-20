public class Direccion
{
    private int numero ;
    private String calle; 
    private String ciudad ;
    public Direccion(String calle, String ciudad, int numero){
        setNumero(numero);
        setCiudad(ciudad);
        setCalle(calle);
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setCalle(String calle){
        this.calle =calle ;
    }
    public String getCalle(){
        return this.calle;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad ;
    }
    public String getCiudad(){
        return this.ciudad ;
    }
}