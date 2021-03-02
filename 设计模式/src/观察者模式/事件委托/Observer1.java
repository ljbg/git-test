package 观察者模式.事件委托;



//看股票的同事
public class Observer1 {
    protected String name;
    protected Notifier notifier;

    public Observer1(String name, Notifier notifier) {
        this.name = name;
        this.notifier = notifier;
    }

    public void closeMarket(){
        System.out.println("关闭股票 继续工作   "+name);
    }
}
