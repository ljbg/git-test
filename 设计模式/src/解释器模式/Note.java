package 解释器模式;

public class Note extends Expression {
    @Override
    public void execute(String key, double value) {
        String note = "";
        switch (key){
            case "C": note = "do"; break;
            case "D": note = "re"; break;
            case "E": note = "mi"; break;
            case "F": note = "fa"; break;
            case "G": note = "so"; break;
            case "A": note = "la"; break;
            case "B": note = "ti"; break;
        }
        System.out.println(note);
    }
}
