package 状态模式;

//中午工作状态
public class NoonState extends State{
    @Override
    public void writeProgram(Work w) {
        if(w.getHour()<13){
            System.out.println("当前时间 :"+w.getHour()+" 午饭, 午休 ");
        }
        else {
            w.setState(new AfterNoonState());
            w.writeProgram();
        }
    }
}
