package Singleton;

/**
 * Singleton "apressado"
 * 
 * @author Luiz Sor.
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){

    }

    public static SingletonEager getInstancia(){
        
        return instancia;
    }
}
