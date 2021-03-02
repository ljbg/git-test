package 桥接模式;

public class Test {
    public static void main(String[] args) {
        HandSetBrand brand;
        brand = new HandSetBrandM();
        brand.setSoft(new HandSetGame());
        brand.run();
        brand = new HandSetBrandN();
        brand.setSoft(new HandSetAddressList());
        brand.run();
    }
}
