package 简单工厂模式;

public class Test {
    public static void main(String[] args) {
        Operation oper;
        oper = OperationFactory.createOperation("/");
        Double result = oper.getResult(2,4);
        System.out.println(result);
    }

}
