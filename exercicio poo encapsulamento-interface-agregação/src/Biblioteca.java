import java.util.ArrayList;

import Pessoas.Pessoa;

public class Biblioteca {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();

        Pessoa p1 = new Pessoa("Luizin", "Masc", 27);
        Pessoa p2 = new Pessoa("Yanka", "Fem", 22);
        Pessoa p3 = new Pessoa("Tatiana", "Fem", 50);

        Livro l1 = new Livro("Senhor dos Aneis - A Sociedade do Anel", "Tolkien", 1228, p1);
        Livro l2 = new Livro("Cronicas de Gelo e Fogo", "George R. R. Martin", 600, p2);
        Livro l3 = new Livro("O Silmarillion", "Tolkien", 496, p3);

        livros.add(l1);
        livros.add(l2);
        livros.add(l3);


        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

    //    l1.detalhar();
        l1.abrir();
     //   l1.avancarPag();
      //  l1.avancarPag();
      //  l1.avancarPag();
        l1.folhear(800);
        l1.fechar();
        l1.abrir();
        l1.fechar();
        l1.detalhar();



    }

}
