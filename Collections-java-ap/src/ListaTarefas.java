import java.util.*;

public class ListaTarefas {
    private static List <Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }


    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List <Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);        
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();
       
        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
    
        listaTarefa.adicionarTarefa("Varrer casa");
        listaTarefa.adicionarTarefa("Passar pano");
        listaTarefa.adicionarTarefa("Passar pano");

        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
