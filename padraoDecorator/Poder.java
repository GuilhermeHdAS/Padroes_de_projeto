package padraoDecorator;

//Componente
public abstract class Poder
{
    int dano;
    String sobre;
    
    public void setDano (int dano)
    {
        this.dano = dano;
    }
    
    public void setSobre (String sobre)
    {
        this.sobre = sobre;
    }
    
    public int getDano ()
    {
        return this.dano;
    }
    
    public String getSobre()
    {
        return this.sobre;
    }
}
