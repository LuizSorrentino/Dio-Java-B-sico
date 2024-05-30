import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos{
    public static void main(String[] args) {
         AgendaEventos agenda = new AgendaEventos();

    // Adiciona eventos à agenda
    agenda.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
    agenda.adicionarEvento(LocalDate.of(2024, 5, 31), "Workshop de Programação", "Aula prática de desenvolvimento");
    agenda.adicionarEvento(LocalDate.of(2024, 8, 10), "Lançamento de Software", "Demonstração da nova versão");
    agenda.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
    agenda.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
    agenda.obterProximoEvento();
    //agenda.exibirAgenda();
    }
    private Hashtable<LocalDate, Evento> agenda;

    public AgendaEventos() {
        this.agenda = new Hashtable<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agenda.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        TreeMap<LocalDate, Evento> eventosEmOrdem = new TreeMap<>(agenda);
        System.out.println(eventosEmOrdem);

    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dataSet = agenda.keySet();
        Collections<Evento> valores = agenda.values();
        agenda.get()*/
        TreeMap<LocalDate, Evento> eventosEmOrdem = new TreeMap<>(agenda);
        LocalDate dataAtual = LocalDate.now();
        for (Map.Entry<LocalDate, Evento> entry : eventosEmOrdem.entrySet()) {
            if (entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual)) {
                System.out.println("O proximo evento " + entry.getValue() + " acontecerá na data "+ entry.getKey());
                break;
            }
        }
    }
    
}
