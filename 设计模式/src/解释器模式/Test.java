package 解释器模式;

public class Test {
    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        context.setText("O 2 E 0.5 ");
        Expression expression = null;
        try {


            while (context.getText().length() > 0) {
                String str = context.getText().substring(0, 1);
                switch (str) {
                    case "O":
                        expression = new Scale();
                        break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "A":
                    case "B":
                    case "P":
                        expression = new Note();
                        break;
                }
                expression.interpret(context);
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}
