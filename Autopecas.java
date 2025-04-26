package autopecas;

public class Autopecas
{
    public static void main(String[] args)
    {
        Estoque estoque = new Estoque(100);

        estoque.adicionarPeca(new Pecas(100, "Bomba de Água", 20, 0.8));
        estoque.adicionarPeca(new Pecas(101, "Filtro de Óleo", 10, 0.5));
        estoque.adicionarPeca(new Pecas(102, "Pastilha de Freio", 5, 1.2));
        estoque.adicionarPeca(new Pecas(104, "Velas de Ignição", 15, 0.3));
        estoque.adicionarPeca(new Pecas(105, "Bateria 60Ah", 10, 12.0));
       

        estoque.retirarUnidades(4, 5);
        estoque.acrescentarUnidades(3, 12);
        //estoque.relatorioGeral();
        estoque.imprimirPeca(1);

    }
}
