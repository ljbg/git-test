package 代理模式;

public class Proxy implements GiveGift {
    Persuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Persuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
