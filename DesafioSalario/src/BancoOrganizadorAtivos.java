import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

@SuppressWarnings("unused")
public class BancoOrganizadorAtivos {
  @SuppressWarnings("resource")
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < > ();

    //Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();
    
    String codigoAtivo = scanner.nextLine();
    ativos.add(codigoAtivo);
    ativos.remove(codigoAtivo);
    // Entrada dos códigos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
      codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
    }
    Collections.sort(ativos);

    for (int i = 0; i < quantidadeAtivos; i++) {
    System.out.println(ativos.get(i));
    }


  }
}

