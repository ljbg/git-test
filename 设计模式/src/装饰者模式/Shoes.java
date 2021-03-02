package 装饰者模式;

public class Shoes extends  Decorator {

    @Override
    public void show(){
        System.out.println("穿着老爹鞋的");
        super.show();
    }
}
