package DIO.gof;

import DIO.gof.Singleton.SingletonEager;
import DIO.gof.Singleton.SingletonLazy;
import DIO.gof.Singleton.SingletonLazyHolder;
import DIO.gof.Strategy.ComportamentoAgressivo;
import DIO.gof.Strategy.ComportamentoDefensivo;
import DIO.gof.Strategy.ComportamentoNormal;
import DIO.gof.Strategy.Robo;

public class Test {
    public static void main(String[] args) {
        SingletonEager eager = SingletonEager.getInstancia();
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();

        System.out.println(eager);
        System.out.println(lazy);
        System.out.println(holder);

        // Strategy

        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoAgressivo atack = new ComportamentoAgressivo();
        ComportamentoDefensivo defesa = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();
        robo.mover();

    }
}
