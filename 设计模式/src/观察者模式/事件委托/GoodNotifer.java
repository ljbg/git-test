package 观察者模式.事件委托;

public class GoodNotifer extends Notifier {

    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("有新的同事委托尽职尽责的放哨人!");
        this.getEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void notifyX() {
        System.out.println("尽职尽责的放哨人告诉所有需要帮忙的同事：老板来了");
        try{
            this.getEventHandler().notifyX();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
