package 观察者模式;

public class Test {
    public static void main(String[] args) {
        Subject s = new ConcreteSubject();
        Concrete1Observer a = new Concrete1Observer("李俊波", s);
        Concrete2Observer b = new Concrete2Observer("郝英", s);
        s.attach(a);
        s.attach(b);
        s.setAction("老板回来了");
        s.notifyList();
    }
}
