package Subsistema2;

import DIO.gof.Singleton.SingletonLazy;

public class CEPapi{
        private static CEPapi instance;

        private CEPapi(){
            //chamada explicita
            super();
        }

        public static  CEPapi getInstance(){
            return instance;
        }

        public String retornaCidade(String cep) {
            return "Goiania";
        }

        public String retornaCidade(String cep) {
            return "Goias";
        }

}
