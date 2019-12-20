package padraoDecorator;

//Decorador concreto
public class SuperForca extends PoderDecorador
{
    public SuperForca (Poder poderDecorado)
    {
        super (poderDecorado);
        setDano (8);
        setSobre ("Poder Super Forca, dano 8.");
    }
}
