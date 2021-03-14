package 访问者模式;

//访问者
abstract class Visitor {
    public abstract void visitElementA(ElementA elementA);
    public abstract void visitElementB(ElementB elementB);
}
