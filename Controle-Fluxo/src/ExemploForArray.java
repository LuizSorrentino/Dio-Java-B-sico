public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Luiz", "Paula", "Jorge", "José"};

        for (int x = 0; x < alunos.length; x++) {

            System.out.println("O Aluno do indice " + x + " é " + alunos[x]);
        }

        for (@SuppressWarnings("unused") String aluno : alunos){
            System.out.println("O nome do aluno é " + aluno);
        }
    }
    
}
