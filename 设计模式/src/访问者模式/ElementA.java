package 访问者模式;

public class ElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }

    public void operationA(){

    }
}
