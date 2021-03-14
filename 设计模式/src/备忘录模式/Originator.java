package 备忘录模式;

//发起人
public class Originator {
    private String state;     //需要保存的数据

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return (new Memento(state));
    }

    public void setMemento(Memento memento){
        state = memento.getState();
    }

    public void show(){
        System.out.println("当前血量:  "+state);
    }
}
