package 建造者模式;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Builder1 builder1 = new Builder1();
        Builder2 builder2 = new Builder2();
        director.construct(builder2);
        Product p = builder2.getResult();
        p.show();
//        director.construct(builder1);
//        Product p = builder1.getResult();
//        p.show();
    }
}
