package 代理模式;

public class Persuit implements GiveGift {

    SchoolGirl mm;

    public Persuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName()+" 送你娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName()+" 送你花花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName()+" 送你巧克力");
    }
}
