package 装饰者模式;

public class Bigtrouser extends Decorator {

    @Override
    public void show(){
        System.out.println("穿着大裤衩的");
        super.show();
    }
}
