package 状态模式;

//下午工作状态
public class AfterNoonState extends State{
    @Override
    public void writeProgram(Work w) {
        if(w.getHour()<17){
            System.out.println("当前时间 :"+w.getHour()+" 下午状态不错,继续努力");
        }
        else {
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
