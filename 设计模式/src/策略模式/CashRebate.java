package 策略模式;

//打折
public class CashRebate implements CashSuper {

    private static double rebate  = 0.8;

//    public CashRebate(double rebate) {
//        this.rebate = rebate;
//    }

    @Override
    public double acceptCash(double money) {
        return rebate*money;
    }
}
