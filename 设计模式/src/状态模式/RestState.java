package 状态模式;

//下班状态
public class RestState  extends State{
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间 :"+w.getHour()+" 下班回家了");
    }
}
