package 访问者模式;

public class Test {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new ElementA());
        o.attach(new ElementB());
        Visitor1 visitor1 = new Visitor1();
        o.accept(visitor1);
        Visitor2 visitor2 = new Visitor2();
        o.accept(visitor2);
    }
}
