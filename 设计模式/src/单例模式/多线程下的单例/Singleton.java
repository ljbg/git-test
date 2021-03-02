package 单例模式.多线程下的单例;

public class Singleton {
    private  static Singleton instance;
    private  static  final Object syn = new Object();

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (syn){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
