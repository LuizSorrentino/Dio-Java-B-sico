package Pessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Luiz", "Masc", 27);
        Funcionario p2 = new Funcionario("Roberto", "Masc", 40);
        Professor p3 = new Professor("Katia", "Fem", 23);
        Aluno p4 = new Aluno("Maria", "Fem", 29);

        p1.fazerAniver();
        p2.setSetor("Almoxarife");
        p2.mudarTrabalho();
        p3.setEspecialidade("Geografia");
        p3.setSalario(3000f);
        p3.receberAum(200);
        p4.setCurso("Desenvolvimento de software");
        p4.setMatricula(235060);
        p4.cancelarMatri();
        System.out.println(p1 + "\n" + p2 + "\n" + p3 + "\n" + p4);
    }
}
