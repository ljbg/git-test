package 装饰者模式;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("李俊波");
        Tshirts a = new Tshirts();
        Bigtrouser b = new Bigtrouser();
        Shoes c = new Shoes();
        c.decorate(person);
        b.decorate(c);
        a.decorate(b);
        a.show();
    }
}
