package 代理模式.动态代理;

//房东要买房
public class Host implements Rent {
    public void rent(){
        System.out.println("出租房屋");
    }
}
