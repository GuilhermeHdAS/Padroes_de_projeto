package padraoDecorator;

//Decorador Concreto
public class Raio extends PoderDecorador
{
    public Raio (Poder poderDecorado)
    {
        super(poderDecorado);
        setDano (5);
        setSobre ("Poder raio, possui dano 5.");
    }
}
