package 访问者模式;

public class ElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }

    public void operationB(){

    }
}
