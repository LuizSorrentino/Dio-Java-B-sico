import java.util.*;

public class AgendaContatos {
    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();
        contatos.adicionarContato("luiz", 8989);
        contatos.adicionarContato("rodrigo", 5050);
        contatos.adicionarContato("jose", 7979);
        contatos.adicionarContato("ana", 5656);
        System.out.println(contatos.pesquisarPorNome("ana"));
        contatos.atualizarNumeroContato("ana", 4646);
        contatos.exibirContatos();
        System.out.println(contatos.pesquisarPorNome("ana"));
    }

    private HashSet<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
    
    public HashSet<Contato> pesquisarPorNome(String nome){
        HashSet<Contato> contatosNome = new HashSet<>();
        
        if (!contatos.isEmpty()) {
            for (Contato contato : contatos) {
                if (contato.getNome().startsWith(nome)) {
                    contatosNome.add(contato);
                }
            }
            return contatosNome;
        }else{
            throw new RuntimeException("Lista está vazia");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if (!contatos.isEmpty()) {
            for (Contato contato : contatos) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    contato.setNumero(novoNumero);
                    contatoAtualizado = contato;
                    break;
                }
            }
            return contatoAtualizado;
        }else{
            throw new RuntimeException("Lista está vazia");
        }
    }

}
