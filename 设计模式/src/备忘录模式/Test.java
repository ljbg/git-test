package 备忘录模式;

public class Test {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("100血量");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());   //保存

        o.setState("50血量");
        o.show();

        o.setMemento(c.getMemento());    //恢复
        o.show();

    }
}
