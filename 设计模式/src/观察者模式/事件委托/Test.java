package 观察者模式.事件委托;

public class Test {
    public static void main(String[] args) {
        GoodNotifer n = new GoodNotifer();
        Observer1 o1 = new Observer1("李俊波", n);
        Observer2 o2 = new Observer2("郝英", n);
         n.addListener(o1,"closeMarket");
        n.addListener(o2,"closeGame");
        n.notifyX();
    }
}
