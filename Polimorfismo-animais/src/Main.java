import Animal.Mamifero.Cachorro;
import Animal.Mamifero.Mamifero;


public class Main {
    public static void main(String[] args) {
        //animal a = new Animal(); não pode ser feito pois Animal é uma classe abstrata
        Mamifero m = new Mamifero();
        Cachorro c = new Cachorro();

        //m.setPeso(35.8f);
        //m.setCorPelo("Marrom");
        //m.alimentar();
        //m.emitirSom();
        //c.emitirSom();
        c.reagir(false);
        c.reagir("saia dai");
        c.reagir(12, 45);
        c.reagir(24, 00);
        c.reagir(4,10.2f);
    }
}
