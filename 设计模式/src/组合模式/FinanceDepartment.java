package 组合模式;

//财务部
public class FinanceDepartment extends Company{
    public FinanceDepartment(String name) {
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
        System.out.println("管理公司财务: " +name);
    }
}
