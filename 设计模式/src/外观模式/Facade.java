package 外观模式;

public class Facade {
    One one;
    Two two;
    Three three;

    public Facade() {
        this.one = new One();
        this.two = new Two();
        this.three = new Three();
    }

    public void methodA(){
        one.one();
        two.two();
        three.three();
    }

    public void methodB(){
        three.three();
    }
}
