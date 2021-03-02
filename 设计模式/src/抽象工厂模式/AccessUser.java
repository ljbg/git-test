package 抽象工厂模式;

public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在Access中给user表增加一条记录");
    }

    @Override
    public IUser getIUser(int id) {
        System.out.println("在Access中根据id得到user表中一条记录");
        return null;
    }
}
