package 代理模式;

public class Test {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl();
        mm.setName("郝英");
        Proxy proxy = new Proxy(mm);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
