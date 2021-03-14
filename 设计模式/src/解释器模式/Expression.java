package 解释器模式;

//解释器
public abstract class Expression {
    public void interpret(PlayContext context){
        if(context.getText().length() == 0){
            return;
        }
        else{
            String playKey = context.getText().substring(0,1);
            context.setText(context.getText().substring(2));
            double playValue = Double.parseDouble(context.getText().substring(0,1));
            context.setText(context.getText().substring(2));

            execute(playKey,playValue);
        }
    }

    //执行   不同的文法子类,有不同的处理
    public abstract void execute(String key,double value);
}
