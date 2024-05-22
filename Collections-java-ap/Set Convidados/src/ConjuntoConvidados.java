import java.util.*;

public class ConjuntoConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Luiz", 5263);
        convidados.adicionarConvidado("Rodrigo", 5263);
        convidados.adicionarConvidado("Julia", 7496);
        convidados.adicionarConvidado("Ana", 2684);
        //convidados.removerConvidadoPorCodigoConvite(5486);
        convidados.contarConvidados();
        convidados.exibirConvidados();
    }
    private Set<Convidados> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidados(nome, codigoConvite));
    }
    
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidados convidadoParaRemover = null;
        for (Convidados c : convidados) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    public void contarConvidados(){
        System.out.println("A lista de convidados contém " + convidados.size() + " pessoas.");

    }

    public void exibirConvidados(){
        for (Convidados convidados2 : convidados) {
            System.out.println(convidados2);
        }
    }
}
