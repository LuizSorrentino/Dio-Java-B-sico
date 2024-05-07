package Pessoas;
public class Funcionario extends Pessoa{

    public Funcionario(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    private String setor;
    private boolean trabalhando;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }


    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(){
        setTrabalhando(!trabalhando);
    }

    @Override
    public String toString() {
        return  "================================================================"+
                "\n| Funcionario " + getNome() + ", " + getIdade() + " anos, " + getSexo() + 
                "\n| Setor: " + setor + 
                "\n| Trabalhando=" + trabalhando+
                "\n================================================================";
    }
    
}
