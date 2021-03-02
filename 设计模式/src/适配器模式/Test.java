package 适配器模式;

public class Test {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.request();

    }
}
