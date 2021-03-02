package 工厂方法模式;

public class Test {
    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng leiFeng = factory.createLeiFeng();
        leiFeng.buyRice();
        leiFeng.sweep();
        leiFeng.wash();
    }
}
