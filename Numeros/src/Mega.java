import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Mega {
    public static void main(String[] args) throws Exception {

        Random random = new Random();
        List<Integer> mega = new ArrayList<Integer>();
        List<Integer> resultado = new ArrayList<Integer>();
        int z = 1;
        while (z != 60){
        
            mega.add(z);
            z++;
            if (z==60) {
                mega.add(z);
            }

        }
        int i =0;
        while (i != 6){
            
            int sort = random.nextInt(mega.size());
            resultado.add(mega.get(sort));
            mega.remove(sort);
            
            i++;
        
        }
        
        Collections.sort(resultado);
        System.out.println(resultado);
    }
}
