
public class Carro extends Veiculo{
    
    public void ligar(){
    System.out.println("Veiculo Ligado");
    confereCambio();
    confereCombustivel();
    }
    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio(){
        System.out.println("Conferindo cambio");
    }

}
