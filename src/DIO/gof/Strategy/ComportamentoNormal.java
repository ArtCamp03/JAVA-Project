package DIO.gof.Strategy;

public class ComportamentoNormal implements Comportamento{

    @Override
    public void mover(){
        System.out.println("movendo normalmente");
    }
}
