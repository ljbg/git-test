package 访问者模式;

public class Visitor2 extends Visitor {
    @Override
    public void visitElementA(ElementA elementA) {
        System.out.println("访问者2访问元素A");
    }

    @Override
    public void visitElementB(ElementB elementB) {
        System.out.println("访问者2访问元素B");
    }
}
