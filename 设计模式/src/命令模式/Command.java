package 命令模式;

//抽象命令
public abstract  class Command {
    protected Barbecuer receiver;
    protected String name;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    //执行命令
    abstract public void execute();
}
