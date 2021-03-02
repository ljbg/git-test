package 抽象工厂模式;

public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在Access中给department表增加一条记录");
    }

    @Override
    public IUser getIDepartment(int id) {
        System.out.println("在Access中根据id得到department表的一条记录");
        return null;
    }
}
