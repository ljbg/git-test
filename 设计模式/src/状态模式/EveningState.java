package 状态模式;

//晚上工作状态
public class EveningState extends State {
    @Override
    public void writeProgram(Work w) {
        if(w.isFinish()){
            w.setState(new RestState());     //转入下班状态
            w.writeProgram();
        }
        else {
            if(w.getHour()<21){
                System.out.println("当前时间 :"+w.getHour()+" 加班,太累了");
            }
            else {
                w.setState(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
