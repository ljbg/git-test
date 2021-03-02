package 建造者模式;

public interface Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
