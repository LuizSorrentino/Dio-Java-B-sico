import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe seu saldo atual: ");
            double saldoAtual = scanner.nextDouble();

            System.out.print("Informe o valor depositado: ");
            double valorDeposito = scanner.nextDouble();

            System.out.print("Informe o valor retirado: ");
            double valorRetirada = scanner.nextDouble();

            double saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;
        
            System.out.println("Saldo atualizado na conta: " + saldoAtualizado);
            scanner.close();
        
    }
}
