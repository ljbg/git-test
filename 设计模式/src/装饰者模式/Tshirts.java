package 装饰者模式;

public class Tshirts extends Decorator {

    @Override
    public void show(){
        System.out.println("穿着衬衫的");
        super.show();
    }
}
