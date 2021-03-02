package 中介者模式;

public class Test {
    public static void main(String[] args) {
        CorrectMediator m = new CorrectMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);
        m.setColleague1(c1);
        m.setColleague2(c2);
        c1.Send("你好");
        c2.Send("你也好");
    }
}
