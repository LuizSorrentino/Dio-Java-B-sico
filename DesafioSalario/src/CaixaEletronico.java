import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        if (saldoTotal >= valorSaque) {
            int saldoAtualizado = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoAtualizado);

        }else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
        scanner.close();
    }
}
