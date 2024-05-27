import java.util.*;

public class ListaTarefas {
    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();
        tarefas.adicionarTarefa("varrer");
        tarefas.adicionarTarefa("varrer");
        tarefas.adicionarTarefa("passar pano");
        tarefas.adicionarTarefa("tirar poeira");
        tarefas.adicionarTarefa("organizar objetos");
        System.out.println("Existem " + tarefas.contarTarefas() + " tarefas na lista");
        tarefas.marcarTarefaConcluida("varrer");
        tarefas.marcarTarefaConcluida("passar pano");
        System.out.println("--------------Tarefas Concluidas--------------");
        System.out.println(tarefas.obterTarefasConcluidas());
        System.out.println("----------------------------");
        System.out.println("-------------Tarefas Pendentes---------------");
        System.out.println(tarefas.obterTarefasPendentes());
        System.out.println("----------------------------");
        //tarefas.exibirTarefas();
    }
    
    private HashSet<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if (!tarefas.isEmpty()) {
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getDescricao()==descricao) {
                    tarefas.remove(tarefa);
                    break;
                }
            }
        }else{
            throw new RuntimeException("Lista está vazia");
        }
    }

    public void exibirTarefas(){
        if (!tarefas.isEmpty()) {
            for (Tarefa tarefa : tarefas) {
                System.out.println(tarefa);
            }
        }else{
            System.out.println("A Lista está vazia");
        }
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public void marcarTarefaConcluida(String descricao){
        if (!tarefas.isEmpty()) {
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getDescricao()==descricao) {
                    tarefa.setConcluida(true);
                }
            }
        }
    }

    public HashSet<Tarefa> obterTarefasConcluidas(){
        HashSet<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefas.isEmpty()) {
            for (Tarefa tarefa : tarefas) {
                if (tarefa.isConcluida()) {
                    tarefasConcluidas.add(tarefa);
                }
            }
            return tarefasConcluidas;
        }else{
            throw new RuntimeException("Lista está vazia");
        }
    }

    public HashSet<Tarefa> obterTarefasPendentes(){
        HashSet<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefas.isEmpty()) {
            for (Tarefa tarefa : tarefas) {
                if (!tarefa.isConcluida()) {
                    tarefasPendentes.add(tarefa);
                }
            }
            return tarefasPendentes;
        }else{
            throw new RuntimeException("Lista está vazia");
        }
    }

    public String limparListaTarefas(){
        tarefas.clear();
        return "Tarefas foram limpas";
    }
}
