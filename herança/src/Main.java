public class Main {
    public static void main(String[] args) {
        Bolsista b1 = new Bolsista("Luizin", "Masc", 22);
        b1.setCurso("Programação");
        b1.setMatricula(124685);
        b1.setBolsa(500);
        b1.pagarMensalidade();
        b1.renovarBolsa();
        System.out.println(b1);
    }
}
