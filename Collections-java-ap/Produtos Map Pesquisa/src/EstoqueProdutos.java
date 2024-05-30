import java.util.*;

public class EstoqueProdutos {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        System.out.println(estoque.calcularValorTotalEstoque());

        System.out.println(estoque.obterProdutoMaisCaro());

        System.out.println(estoque.obterProdutoMaisBarato());

        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
    private Hashtable<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new Hashtable<Long, Produto>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoque.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoque);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        if (!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                valorTotal += p.getPreco()*p.getQuantidade();
            }
            return valorTotal;
        }else{
            throw new RuntimeException("Lista está vazia");
        }
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p:estoque.values()){
            if (p.getPreco()>maiorPreco) {
                produtoMaisCaro=p;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoque.values()) {
            if (p.getPreco()<menorPreco) {
                produtoMaisBarato=p;
                menorPreco=p.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValor = null;
        double valorAuxiliar=0;
        for (Produto p : estoque.values()) {
            if (p.getPreco()*p.getQuantidade()>valorAuxiliar) {
                produtoMaiorQuantidadeValor = p;
                valorAuxiliar = p.getPreco()*p.getQuantidade();
            }
        }
        return produtoMaiorQuantidadeValor;
    }

    @Override
    public String toString() {
        return " " + estoque + " ";
    }

    
    
}
