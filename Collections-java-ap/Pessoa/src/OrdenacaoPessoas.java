import java.util.ArrayList;
import java.util.*;

public class OrdenacaoPessoas {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("maria", 12, 1.60);
        ordenacaoPessoas.adicionarPessoa("jose", 17, 1.50);
        ordenacaoPessoas.adicionarPessoa("roberto", 15, 1.80);
        ordenacaoPessoas.adicionarPessoa("carla", 10, 1.20);

        //System.out.println(ordenacaoPessoas.ordenarAltura());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public ArrayList<Pessoa> ordenarPorIdade(){
        ArrayList<Pessoa> pessoasIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }

    public ArrayList<Pessoa> ordenarAltura(){
        ArrayList<Pessoa> pessoasAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasAltura, new ComparatorPorAltura());
        return pessoasAltura;
    }
}

class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}
