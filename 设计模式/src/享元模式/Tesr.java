package 享元模式;

public class Tesr {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();
        User u1 = new User("李俊波");
        User u2 = new User("郝英");
        User u3 = new User("小明");
        Website w1 = factory.getWebsite("产品展示");
        Website w2 = factory.getWebsite("产品展示");
        Website w3 = factory.getWebsite("产品展示");
        Website w4 = factory.getWebsite("博客");
        Website w5 = factory.getWebsite("博客");
        Website w6 = factory.getWebsite("博客");
        w1.use(u1);
        w2.use(u2);
        w3.use(u3);
        w4.use(u1);
        w5.use(u2);
        w6.use(u3);

        System.out.println(factory.getCount());

    }
}
