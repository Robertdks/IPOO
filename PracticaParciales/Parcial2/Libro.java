public  class Libro 
{
    private String titulo ;
    private String autor ;
    private String genero ;
    private double precioBase ;
    public Libro(String titulo, String autor, String genero, double precioBase){
        this.titulo = titulo ;
        this.autor = autor ;
        this.genero = genero ;
        this.precioBase = precioBase ;
    }
    public double getPrecioBase(){
        return this.precioBase ;
    }
}