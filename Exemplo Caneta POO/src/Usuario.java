
public class Usuario {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("bic", 35, "vermelha", 100);
        caneta1.status();
        caneta1.setModelo("bic");
        caneta1.setCor("vermelha");
        caneta1.setCarga(30);
        caneta1.setTipoPonta(35);

        caneta1.destampar();
        caneta1.escrever();
        caneta1.setCarga(20);
        
        caneta1.pintar();
        caneta1.setCarga(0);
        
        caneta1.rabiscar();
        caneta1.setCarga(100);
        
        caneta1.rabiscar();
        caneta1.tampar();
        caneta1.status();
    }

    
}
