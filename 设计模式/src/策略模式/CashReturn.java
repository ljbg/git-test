package 策略模式;

//返利
public class CashReturn  implements CashSuper{

    private double condition = 300.0;    //返利条件
    private double returnMoney  = 100.0;   //返利金额

//    public CashReturn(double condition, double returnMoney) {
//        this.condition = condition;
//        this.returnMoney = returnMoney;
//    }

    /**
     * 若大于返利条件,就减去返利金额
     * @param money
     * @return
     */
    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= condition){
            result = money  - (int)(money/condition)*returnMoney;
        }
        return result;
    }
}
