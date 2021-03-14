package 命令模式;

public class Test {
    public static void main(String[] args) {
        Barbecuer receiver = new Barbecuer();
        BakeChickenCommand bakeChickenCommand = new BakeChickenCommand(receiver);
        BakeMuttonCommand bakeMuttonCommand = new BakeMuttonCommand(receiver);
        Waiter waiter = new Waiter();

        waiter.setOrders(bakeChickenCommand);
        waiter.setOrders(bakeMuttonCommand);
        waiter.setOrders(bakeMuttonCommand);
        waiter.notifyReceiver();
    }
}
