package 抽象工厂模式;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        User user = new User();
        Department department = new Department();

        IUser iUser = DataAccess.createUser();
        IDepartment idepartment = DataAccess.createDepartment();

        iUser.insert(user);
        iUser.getIUser(1);
        idepartment.insert(department);
        idepartment.getIDepartment(1);
    }
}
