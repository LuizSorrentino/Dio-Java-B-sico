public class Operadores {
    public static void main (String[] args) {

       boolean condicaoUm = false;
       boolean condicaoDois = true;

       if ((7>5) && condicaoDois){

        System.out.println("as duas condições são verdadeiras");
    }
       if (condicaoUm || condicaoDois){

        System.out.println("uma das condições é verdadeira");
        
       }
       System.out.println("fim");
    }
}