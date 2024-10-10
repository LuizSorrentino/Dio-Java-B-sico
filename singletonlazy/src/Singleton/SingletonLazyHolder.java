package Singleton;
/**
 * Singleton "Lazy Holder"
 * 
 * @author Luiz Sor.
 */

public class SingletonLazyHolder {
    public static class InstanceHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    

    private SingletonLazyHolder(){

    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
