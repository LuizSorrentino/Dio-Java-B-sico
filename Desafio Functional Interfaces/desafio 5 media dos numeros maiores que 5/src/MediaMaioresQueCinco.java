import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class MediaMaioresQueCinco {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Predicate<Integer> maiorQueCinco = numero -> numero>5;
        List<Integer> maioresQueCinco = numeros.stream()
        .filter(maiorQueCinco)
        .toList();
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        long resultado = maioresQueCinco.stream()

        .reduce(0, somar);
        resultado = resultado/(maioresQueCinco.size());

        System.out.println("O resultado da média é: " + resultado);
    }
}
