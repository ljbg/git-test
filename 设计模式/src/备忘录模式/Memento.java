package 备忘录模式;

//备忘录
public class Memento {
    private String state;    //需要保存的状态,可以是多个

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
