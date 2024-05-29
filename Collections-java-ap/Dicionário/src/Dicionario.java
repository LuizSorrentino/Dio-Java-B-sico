import java.util.*;

public class Dicionario {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("1", "um");
        dicionario.adicionarPalavra("2", "dois");
        dicionario.adicionarPalavra("3", "tres");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("2"));
        dicionario.removerPalavra("3");
        dicionario.exibirPalavras();
    }
    private Hashtable<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new Hashtable<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        dicionario.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra){
        return dicionario.get(palavra);
    }

    @Override
    public String toString() {
        return " " + dicionario + " ";
    }
}
