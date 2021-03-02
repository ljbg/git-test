package 观察者模式;

import java.util.ArrayList;

//具体通知者
public class ConcreteSubject extends Subject {

    private ArrayList<Observer> list = new ArrayList<Observer>();
    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
         list.remove(observer);
    }

    @Override
    public void notifyList() {
        for (Observer observer : list) {
            observer.update();
        }
    }
}
