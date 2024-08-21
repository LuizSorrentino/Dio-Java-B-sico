
import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;

public class PessoaTest {
    @Test
    void validarCalculoDeIdade(){
        Pessoa jessica = new Pessoa ("Jessica", LocalDateTime.of(2000, 1, 1, 15, 15));
        Assertions.assertEquals(24, jessica.getIdade());
    }

    @Test
    void deveRetornaSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa ("Jessica", LocalDateTime.of(2000, 1, 1, 15, 15));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }

    public static void main(String[] args) {
        
    }
}
