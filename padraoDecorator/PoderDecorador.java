package padraoDecorator;

//Decorador
public abstract class PoderDecorador extends Poder
{
    private Poder poderDecorado;
    
    public PoderDecorador (Poder poderDecorado){
        this.poderDecorado = poderDecorado;
    }
    
    public int getDano (){
        return poderDecorado.getDano() + this.dano;
    }
    
    public String getSobre() {
        return poderDecorado.getSobre() + ", "+ this.sobre;
    }
}
