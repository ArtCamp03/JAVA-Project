package DIO.gof.Strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover(){
        System.out.println("movendo no atack");
    }
}
