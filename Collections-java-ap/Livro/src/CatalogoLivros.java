import java.util.*;

public class CatalogoLivros {
    private static List <Livro> catalogoLivros;

    public CatalogoLivros(){
        CatalogoLivros.catalogoLivros = new ArrayList<>();
    }

    public static List<Livro> getCatalogoLivros() {
        return catalogoLivros;
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        catalogoLivros.add(new Livro (livro));
    }

    public static void pesquisarPorAutor(String autor){
            for (Livro l : catalogoLivros) {
                if (l.getAutor().equals(autor)) {
                    System.out.println (((Livro) livro).getTitulo());  
                }  
    }
}
public static void main(String[] args) {
    CatalogoLivros livro1 = new CatalogoLivros();
    livro1.adicionarLivro("Senhor dos Anéis", "Tolkien", 1954);
    livro1.adicionarLivro("O Simarillion", "Tolkien", 1977);
    livro1.adicionarLivro("Contos da Inacabados", "Tolkien", 1980);
    livro1.adicionarLivro("Cronicas de Gelo e Fogo", "R. R. Martin", 1980);
    
    CatalogoLivros.pesquisarPorAutor("Tolkien");

}
}