package Pessoas;
public class Aluno extends Pessoa{

    public Aluno(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }
    
    private int matricula;
    private String curso;
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatri(){
        System.out.println("Matricula cancelada.");
    }
    @Override
    public String toString() {
        return  "================================================================"+
                "\n| Aluno(a) " + getNome()+ ", " + getIdade() + " anos, " + getSexo() + 
                "\n| Matricula: " + matricula + 
                "\n| Curso=" + curso +
                "\n================================================================";
    }
}
