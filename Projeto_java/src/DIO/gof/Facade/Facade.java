package DIO.gof.Facade;

import Subsistema2.CEPapi;

public class Facade {
    public void MigraCliente(String nome, String cep){
        CEPapi.getInstance().retornaCidade(cep);
    }
}
