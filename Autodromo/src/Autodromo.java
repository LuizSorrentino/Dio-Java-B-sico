public class Autodromo {
    public static void main(String[] args) throws Exception {
        Carro jeep = new Carro();
        jeep.setChassi("165468");
        jeep.ligar();

        Moto tornado = new Moto();
        tornado.setChassi("856846");
        tornado.ligar();
    }
}
