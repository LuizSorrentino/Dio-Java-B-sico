package Pessoas;
public class Professor extends Pessoa{
    public Professor(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void receberAum(float a){
        this.salario+=a;
    }

    @Override
    public String toString() {
        return  "================================================================"+
                "\n| Professor " + getNome() + ", " + getIdade() + " anos, " + getSexo() + 
                "\n| Especialidade"+ especialidade + 
                "\n| Salario=" + salario+
                "\n================================================================";
    }
}
