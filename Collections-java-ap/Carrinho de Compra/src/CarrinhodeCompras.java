import java.util.*;

public class CarrinhodeCompras {

    private ArrayList<Item> carrinho;

    public ArrayList<Item> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Item> carrinho) {
        this.carrinho = carrinho;
    }

    public CarrinhodeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String descricao){
        ArrayList<Item> itensRemover = new ArrayList<>();
        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(descricao)) {
                itensRemover.add(item);
            }
        }
        carrinho.removeAll(itensRemover);
    }

    public void calcularValorTotal(){
        float total=0;
        for (Item item : carrinho) {
            total = total + item.getPreco()*item.getQuantidade();
        }
        System.out.printf("O valor total da compra ficou R$ %.2f %n", (total));
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }



public static void main(String[] args) {
    CarrinhodeCompras carrinho = new CarrinhodeCompras();
    carrinho.adicionarItem("Pao de forma", 12.79f, 6);
    carrinho.adicionarItem("bolo de cenoura", 25.27f, 3);
    carrinho.adicionarItem("frango", 18.43f, 7);
    carrinho.removerItem("jujuba");
    carrinho.exibirItens();
    carrinho.calcularValorTotal();
}
}