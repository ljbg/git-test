package 观察者模式;

//通知者接口
abstract class Subject {
    protected String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public abstract void attach(Observer observer);
    public abstract void detach(Observer observer);
    public  abstract  void notifyList();
}
