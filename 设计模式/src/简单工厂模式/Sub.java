package 简单工厂模式;

public class Sub extends  Operation{
    @Override
    public double getResult(double numA, double numB) {
        double result = 0;
        return result=numA-numB;
    }
}
