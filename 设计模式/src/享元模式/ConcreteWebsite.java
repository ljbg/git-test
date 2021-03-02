package 享元模式;

//具体网站
public class ConcreteWebsite extends Website {

    private String  name = "";

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类: "+name+"  用户: "+user.getName());
    }
}
