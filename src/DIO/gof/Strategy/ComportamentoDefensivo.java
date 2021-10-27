package DIO.gof.Strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover(){
        System.out.println("movendo na defensiva");
    }
}
