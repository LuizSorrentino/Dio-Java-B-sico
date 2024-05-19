import java.util.*;

public class CatalogoLivros {
    private static List <Livro> catalogoLivros;
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Senhor dos Anéis", "Tolkien", 1954);
        catalogoLivros.adicionarLivro("O Simarillion", "Tolkien", 1977);
        catalogoLivros.adicionarLivro("Contos da Inacabados", "Tolkien", 1980);
        catalogoLivros.adicionarLivro("Cronicas de Gelo e Fogo", "R. R. Martin", 1980);
        
        catalogoLivros.pesquisarPorAutor("tolkien");
        catalogoLivros.pesquisarPorIntervaloAnos(1960, 1980);
        catalogoLivros.pesquisarPorTitulo("o simarillion");
    
    }

    public CatalogoLivros(){
        CatalogoLivros.catalogoLivros = new ArrayList<>();
    }

    public static List<Livro> getCatalogoLivros() {
        return catalogoLivros;
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        catalogoLivros.add(new Livro (titulo, autor, ano));
    }

    public void pesquisarPorAutor(String autor){
        ArrayList<Livro> livroPorAutor = new ArrayList<>();    
        for (Livro livro : catalogoLivros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livroPorAutor.add(livro);
            }  
        }
        System.out.println(livroPorAutor);
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        ArrayList<Livro> livroIntervaloAno = new ArrayList<>();
        for (Livro livro : catalogoLivros) {
            if (livro.getAno()>=anoInicial && livro.getAno()<=anoFinal) {
                livroIntervaloAno.add(livro);
            }
        }
        System.out.println(livroIntervaloAno);
    }

    public void pesquisarPorTitulo(String titulo){
        for (Livro livro : catalogoLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(livro);
            }
        }
    }


}