package 命令模式;

//烤鸡翅命令  具体命令
public class BakeChickenCommand  extends Command{


    public BakeChickenCommand(Barbecuer receiver) {
        super(receiver);
        this.name="烤鸡翅";
    }

    @Override
    public void execute() {
        receiver.bakeChicken();
    }
}
