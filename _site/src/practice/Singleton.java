package practice;

public class Singleton {

    // double checked locking
    private static volatile Singleton singleton;

    private Singleton () {

    }

    public static Singleton getInstance() {
        if(singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) {
                    return new Singleton();
                }
            }
        }
        return singleton;
    }
}
