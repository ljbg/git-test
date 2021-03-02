package 观察者模式;

public class Concrete1Observer extends Observer {
    public Concrete1Observer(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction()+"   "+name+"继续工作");
    }
}
