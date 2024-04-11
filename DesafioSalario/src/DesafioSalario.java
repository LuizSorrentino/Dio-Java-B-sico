import java.util.Scanner;

public class DesafioSalario {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner pessoa = new Scanner(System.in);
    do {            
        System.out.println("Informe seu salário");
        float salario = pessoa.nextFloat();
        
        System.out.println("Informe o valor dos seus beneficios somados");
        float beneficio = pessoa.nextFloat();

        float valorImposto = 0;

        if (salario <= 1100.00){
            valorImposto = salario * 0.05f; 
        } 
        else if (salario > 1100.00 && salario <= 2500.00){
            valorImposto = salario * 0.10f; 
        }
        else 
            valorImposto = salario * 0.15f; 
        
        float salarioFinal = salario - valorImposto + beneficio;
        System.out.println(salarioFinal);
    }while (continuar());

    System.out.println("Finalizando Operação. Tenha um bom dia !");
}

    private static boolean continuar() {
        // TODO Auto-generated method stub
    
    System.out.println("Deseja continuar?[\"true\" para sim / \"false\" para não] ");
    @SuppressWarnings("resource")
    Scanner sairOuFicar = new Scanner(System.in);
    boolean continuar = sairOuFicar.nextBoolean();
    return continuar;

    
    }
    
    
}
