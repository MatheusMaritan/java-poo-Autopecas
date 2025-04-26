package autopecas;

public class Pecas
{
    private int cod;
    private String descricao;
    private int qtdeEstq;
    private double peso;

    public Pecas(int cod, String descricao, int qtdeEstq, double peso)
    {
        this.cod=cod;
        this.descricao=descricao;
        this.qtdeEstq=qtdeEstq;
        this.peso=peso;
    }

    public int getCodigo()
    {
        return this.cod;
    }

    public String getDescricao()
    {
        return this.descricao;
    }

    public int getQuantidade()
    {
        return this.qtdeEstq;
    }

    public double getPeso()
    {
        return this.peso;
    }

    public void setQuantidade(int quantidade)
    {
        this.qtdeEstq = quantidade;
    }


}
