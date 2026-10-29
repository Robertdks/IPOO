public abstract class Moneda
{
    private float valorDeMoneda ;
    public Moneda(float valor){
        setValorDeMoneda(valor);
    }
    public float getValorDeMoneda(){
        return this.valorDeMoneda ;
    }
    public void setValorDeMoneda(float valor){
        this.valorDeMoneda = valor ;
    }
        public float conversion(float saldo){
        return getValorDeMoneda() * saldo ;
    }
}
