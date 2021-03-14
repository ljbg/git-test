package 访问者模式;


abstract class Element {
    public abstract void accept(Visitor visitor);
}
