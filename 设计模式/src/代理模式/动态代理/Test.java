package 代理模式.动态代理;

public class Test {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyHander proxyHander = new ProxyHander(host);
        Rent proxy = (Rent) proxyHander.getProxy();
        proxy.rent();
    }
}
