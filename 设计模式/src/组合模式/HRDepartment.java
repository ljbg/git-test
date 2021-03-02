package 组合模式;

//人力资源部
public class HRDepartment extends Company{
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        System.out.println("级别:"+depth+" 名称:"+name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println("员工招聘: "+name);
    }
}
