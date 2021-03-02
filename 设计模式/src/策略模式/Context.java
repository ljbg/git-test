package 策略模式;

public class Context {

    private static  String myType = "CashRebate";

    public static double getResult(double money) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       return  ((CashSuper) Class.forName("策略模式."+myType).newInstance()).acceptCash(money);
    }
}
