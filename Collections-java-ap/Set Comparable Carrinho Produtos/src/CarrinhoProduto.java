import java.util.*;

public class CarrinhoProduto {
    public static void main(String[] args) {
        CarrinhoProduto carrinho = new CarrinhoProduto();

        // Adicionando produtos ao cadastro
        carrinho.adicionarProduto(1L, "Smartphone", 1000d, 10);
        carrinho.adicionarProduto(2L, "Notebook", 1500d, 5);
        carrinho.adicionarProduto(3L, "Mouse", 30d, 20);
        carrinho.adicionarProduto(4L, "Teclado", 50d, 15);
        //System.out.println(carrinho.exibirProdutosPorNome());
        System.out.println(carrinho.exibirProdutosPorPreco());

    }

    private HashSet<Produto> carrinho;

    public CarrinhoProduto() {
        this.carrinho = new HashSet<Produto>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        carrinho.add(new Produto(cod, nome, preco, quantidade));
    }

    public TreeSet<Produto> exibirProdutosPorNome(){
        TreeSet<Produto> produtosAlfabetico = new TreeSet<>(carrinho);
        return produtosAlfabetico;
    }

    public TreeSet<Produto> exibirProdutosPorPreco(){
        TreeSet<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(carrinho);
        return produtosPorPreco;
    }
}
