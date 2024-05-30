import java.util.*;

public class ContagemPalavras {
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

    // Adiciona linguagens e suas contagens
    contagemPalavras.adicionarPalavra("Java", 2);
    contagemPalavras.adicionarPalavra("Python", 8);
    contagemPalavras.adicionarPalavra("JavaScript", 1);
    contagemPalavras.adicionarPalavra("C#", 6);
    contagemPalavras.removerPalavra("Java");

    // Exibe a contagem total de linguagens
    System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

    // Encontra e exibe a linguagem mais frequente
    String linguagemMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }

    private Hashtable<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new Hashtable<>();
    }

    @Override
    public String toString() {
        return " " + contagemPalavras + " ";
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (contagemPalavras.containsKey(palavra)) {
            contagemPalavras.remove(palavra);
        }
    }

    public int exibirContagemPalavras(){
        int contagem = 0;
        for (int c : contagemPalavras.values()) {
            contagem+=c;    
        }
        return contagem;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente=null;
        int aux=0;
        for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
            if (entry.getValue()>aux) {
                aux = entry.getValue();
                palavraMaisFrequente=entry.getKey();
            }    
        }
        return palavraMaisFrequente;
    }

}
