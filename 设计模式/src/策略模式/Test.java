package 策略模式;



public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
       double money = Context.getResult(1000.0);
        System.out.println("收费金额 :" +money);
    }
}
