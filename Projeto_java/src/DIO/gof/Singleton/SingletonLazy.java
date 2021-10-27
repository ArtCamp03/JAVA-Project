package DIO.gof.Singleton;

/*
    Singleton : Preguiçoso

    @author ArtCamps
 */
public class SingletonLazy {
    private static  SingletonLazy instance;

    private SingletonLazy(){
        //chamada explicita
        super();
    }

    public static  SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
