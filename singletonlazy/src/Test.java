
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import facade.Facade;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Test {
    public static void main(String[] args) {
        //singleton
        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy=SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder= SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        //facade

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14689751");
    } 
}
