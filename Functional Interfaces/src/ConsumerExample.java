import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

        numeros.forEach(n-> {
            if (n%2==0) {
                System.out.println(n);
            }
            
         
        });
    }
}
