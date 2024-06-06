import java.util.*;

public class LivrariaOnline{
    public static void main(String[] args) {
        LivrariaOnline livros = new LivrariaOnline();
        livros.adicionarLivro("Amazon.com/olé", "olé", "josé", 10);
        livros.adicionarLivro("Amazon.com/abc", "abc", "renato", 100);
        livros.adicionarLivro("Amazon.com/if", "if", "lulu", 20);
        System.out.println(livros.obterLivroMaisCaro());
        System.out.println(livros.exibirLivroMaisBarato());
    }
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livros.put(autor, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(entry.getKey());
                break;
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livroOrdenadoPreco = new ArrayList<>(livros.entrySet());
        Collections.sort(livroOrdenadoPreco, new ComparatorPorPreço());
        System.out.println(livroOrdenadoPreco);
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        List<Map.Entry<String, Livro>> livrosParaOrdenarAutor = new ArrayList<>(livros.entrySet());
        Collections.sort(livrosParaOrdenarAutor, new ComparatorPorAutor());
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String,Livro> entry : livrosParaOrdenarAutor) {
            livrosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro(){
        //declaração do livro pra ser inicializado
        Livro livroMaisCaro=new Livro("", "", 0);
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getPreco()>livroMaisCaro.getPreco()) {
                livroMaisCaro=entry.getValue();
            }
        }
        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato(){
        Livro livroMaisBarato = new Livro("l", "", Double.MAX_VALUE);
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getPreco()<livroMaisBarato.getPreco()) {
                livroMaisBarato=entry.getValue();
                
            }
        }
        return livroMaisBarato;
    }

    @Override
    public String toString() {
        return "" + livros + "";
    }

}
