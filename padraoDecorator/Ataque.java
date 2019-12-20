package padraoDecorator;

//Componente concreto
public class Ataque extends Poder
{
    public Ataque ()
    {
        setDano (2);
        setSobre ("Ataque normal 2, a força do poder pode aumentar o valor do dano de ataque");
    }
}
