package 观察者模式.事件委托;

public class Observer2 {
    protected String name;
    protected Notifier notifier;

    public Observer2(String name, Notifier notifier) {
        this.name = name;
        this.notifier = notifier;
    }

    public void closeGame(){
        System.out.println("关闭游戏 继续工作    "+name);
    }
}
