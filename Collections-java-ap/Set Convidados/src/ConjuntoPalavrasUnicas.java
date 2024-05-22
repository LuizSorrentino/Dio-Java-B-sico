import java.util.HashSet;

public class ConjuntoPalavrasUnicas<String> {

    public static void main(ConjuntoPalavrasUnicas[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas<>();
        palavrasUnicas.adicionarPalavra("babilonica");
        palavrasUnicas.adicionarPalavra("divonica");
        palavrasUnicas.adicionarPalavra("divonica");
        palavrasUnicas.exibirPalavrasUnicas();
        palavrasUnicas.verificarPalavra("divonica");
        palavrasUnicas.removerPalavra("divonica");
        palavrasUnicas.exibirPalavrasUnicas();
    }
    private HashSet<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraRemover = null;
        for (String t : palavrasUnicas) {
            if (t==palavra) {
                palavraRemover = t;
                break;
            }
        }
        palavrasUnicas.remove(palavraRemover);
    }

    public void verificarPalavra(String palavra){
        for (String p : palavrasUnicas) {
            if (p==palavra) {
                System.out.println(" A palavra " + p +" encontra-se presente na lista.");
                break;
            }else{
                System.out.println(" A palavra " + p +" NÃO encontra-se presente na lista.");
            }
        }
    }

    public void exibirPalavrasUnicas(){
        for (String string : palavrasUnicas) {
            System.out.println(string);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavrasUnicas == null) ? 0 : palavrasUnicas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (palavrasUnicas == null) {
            if (other.palavrasUnicas != null)
                return false;
        } else if (!palavrasUnicas.equals(other.palavrasUnicas))
            return false;
        return true;
    }

    @Override
    public java.lang.String toString() {
        return "" + palavrasUnicas;
    }
}
