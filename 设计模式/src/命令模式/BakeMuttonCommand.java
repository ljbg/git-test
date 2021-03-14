package 命令模式;

//烤羊肉串命令  具体命令
public class BakeMuttonCommand  extends Command{


    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
        this.name="烤羊肉串";
    }

    @Override
    public void execute() {
        receiver.bakeMutton();
    }
}
