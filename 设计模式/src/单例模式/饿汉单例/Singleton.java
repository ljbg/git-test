package 单例模式.饿汉单例;

public final class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return instance;
    }
}
