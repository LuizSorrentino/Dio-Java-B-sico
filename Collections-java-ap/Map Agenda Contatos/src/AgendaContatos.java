import java.util.*;

public class AgendaContatos {
    public static void main(String[] args) {
        // Adicionar contatos
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Camila", 123456);
        agenda.adicionarContato("João", 5665);
        agenda.adicionarContato("Carlos", 1111111);
        agenda.adicionarContato("Ana", 654987);
        agenda.adicionarContato("Maria", 1111111);
        agenda.adicionarContato("Camila", 44444);

        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Camila"));
        agenda.removerContato("Ana");
        agenda.exibirContatos();
    }
    private HashMap<String, Integer> agenda;

    public AgendaContatos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agenda.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agenda.isEmpty()) {
            agenda.remove(nome);
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    } 

    public void exibirContatos(){
        System.out.println(agenda);
    }

    public Integer pesquisarPorNome(String nome){
        if (!agenda.isEmpty()) {
            return agenda.get(nome);
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }
}
