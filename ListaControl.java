package autopecas;

public interface ListaControl
{
    int adicionarPeca(Pecas pc);
    boolean retirarUnidades(int index, int quantidade);
    boolean acrescentarUnidades(int index, int quantidade);
    boolean imprimirPeca(int index);
    void relatorioGeral();
    void relatorioReposicao(int qtdMinima);
}
