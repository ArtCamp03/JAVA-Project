package DIO.gof;

public class Test {
    public static void main(String[] args) {
        SingletonEager eager = SingletonEager.getInstancia();
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();

        System.out.println(eager);
        System.out.println(lazy);
        System.out.println(holder);

    }
}
