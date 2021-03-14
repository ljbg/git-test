package 命令模式;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//服务员   通知者
public class Waiter {

    private ArrayList<Command> orders = new ArrayList<Command>();

    //设置订单
    public void setOrders(Command command) {
        if(command.name.equals("烤鸡翅")){
            System.out.println("服务员 : 鸡翅没有了,请你点别的");
        }
        else {
            orders.add(command);
            System.out.println("增加订单: "+ command.name+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        }
    }

    //取消订单
    public void cancelOrders(Command command){
        orders.remove(command);
        System.out.println("取消订单 : "+ command.name+ new Date());
    }

    //通知执行
    public void notifyReceiver(){
        for (Command order : orders) {
            order.execute();
        }
    }
}
