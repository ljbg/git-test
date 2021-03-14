package 状态模式;

//睡眠状态
public class SleepingState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间 :"+w.getHour()+" 不行了,睡着了");
    }
}
