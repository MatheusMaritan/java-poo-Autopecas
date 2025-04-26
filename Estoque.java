package autopecas;

public class Estoque implements ListaControl
{

    private final Pecas[] pecas;
    private int count;

    public Estoque(int capacidade)
    {
        pecas = new Pecas[capacidade];
        count = 0;
    }

    @Override
    public int adicionarPeca(Pecas pc) // Atributos da peça: int cod, String descricao, int qtdeEstq, double peso
    {
        if (count >= pecas.length) return -1;
        pecas[count] = pc;
        return count++;
    }

    @Override
    public boolean retirarUnidades(int index, int quantidade)   // Identificador da peça e quatidade a ser retirada
    {
        if (index < 0 || index >= count || pecas[index].getQuantidade() < quantidade)
        {
            return false;
        }
        pecas[index].setQuantidade(pecas[index].getQuantidade() - quantidade);
        return true;
    }

    @Override
    public boolean acrescentarUnidades(int index, int quantidade) // Identificador da peça e quatidade a ser acrescentada
    {
        if (index < 0 || index >= count) {
            return false;
        }
        pecas[index].setQuantidade(pecas[index].getQuantidade() + quantidade);
        return true;
    }

    @Override
    public boolean imprimirPeca(int index) // Identificador da peça
    {
        if (index < 0 || index >= count)
        {
            return false;
        }
        System.out.println(pecas[index]);
        return true;
    }

    @Override
    public void relatorioGeral()
    {
        for(int i=0;i<count;i++)
        {
            System.out.printf("\nCód.:..........................%d",pecas[i].getCodigo());
            System.out.printf("\nDescr.:........................%s",pecas[i].getDescricao());
            System.out.printf("\nQtd Estq.:.....................%d",pecas[i].getQuantidade());
            System.out.printf("\nPeso:..........................%.2fKg\n",pecas[i].getPeso());
        }
    }

    @Override
    public void relatorioReposicao(int qtdMinima)
    {
        for (int i = 0; i < count; i++) {
            if (pecas[i].getQuantidade() <= qtdMinima) {
                System.out.println(pecas[i]);
            }
        }
    }

}
