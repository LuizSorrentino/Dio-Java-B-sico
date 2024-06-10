import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) throws Exception {
        //usar o Supplier com lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá seja bem vindo!";

        //usar supplier para obter uma lista de 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
