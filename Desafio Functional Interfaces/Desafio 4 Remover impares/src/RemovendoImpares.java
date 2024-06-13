import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemovendoImpares {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Predicate<Integer> isPar = numero -> numero%2 == 0;

        List<Integer> numerosPares = numeros.stream()
        .filter(isPar)
        .toList();
        numerosPares.forEach(System.out::println);


    }
}
