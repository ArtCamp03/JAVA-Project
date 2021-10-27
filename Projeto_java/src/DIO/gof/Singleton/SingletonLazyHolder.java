package DIO.gof.Singleton;

/*
    Singleton : encapsula

    @author ArtCamps
 */
public class SingletonLazyHolder {
    public static class InstanceHolder{
        public static SingletonLazyHolder istancia;
    }


    private SingletonLazyHolder(){
        //chamada explicita
        super();
    }

    public static SingletonLazyHolder getInstance(){
        if(instance == null){
            instance = new SingletonLazyHolder();
        }
        return InstanceHolder.istancia;
    }
}
