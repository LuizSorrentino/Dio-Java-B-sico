import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros{
    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(2);

        System.out.println(numeros.ordenarAscendente());
        //System.out.println(numeros.ordenarDescendente());
    }
    private ArrayList<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add((numero));
    }

    public ArrayList<Integer> ordenarAscendente(){
        ArrayList<Integer> numerosAscendentes = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public ArrayList<Integer> ordenarDescendente(){
        ArrayList<Integer> numerosDescendentes = new ArrayList<>(this.numeros);
        
        if (!numeros.isEmpty()) {
            numerosDescendentes.sort(Collections.reverseOrder());
            return numerosDescendentes;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }
}
