package 观察者模式.事件委托;

public abstract class Notifier {
    //持有（事件处理）的聚集（直接实例化，也可放在构造器中）
    private EventHandler eventHandler=new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }
    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }
    //增加需要帮忙放哨的同事 （）
    public abstract void addListener(Object object,String methodName,Object...args);
    //告诉所有要帮忙放哨的同事：老板来了
    public abstract void notifyX();
}
