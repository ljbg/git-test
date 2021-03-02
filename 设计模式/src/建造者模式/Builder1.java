package 建造者模式;

public class Builder1 implements Builder {

    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
