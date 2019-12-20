package padraoDecorator;

//Decorador Concreto
public class Tonteamento extends PoderDecorador
{
    public Tonteamento (Poder poderDecorado)
    {
        super (poderDecorado);
        setDano (3);
        setSobre ("Poder de tonteamento, dano 3.");
    }
}
