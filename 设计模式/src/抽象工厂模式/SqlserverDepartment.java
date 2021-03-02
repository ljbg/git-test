package 抽象工厂模式;

public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在sqlserver中给department表增加一条记录");
    }

    @Override
    public IUser getIDepartment(int id) {
        System.out.println("在sqlserver中根据id得到department表的一条记录");
        return null;
    }
}
