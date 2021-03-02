package 组合模式;

public class Test {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("李俊波北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));
        ConcreteCompany comp1 = new ConcreteCompany("李俊波上海分公司");
        ConcreteCompany comp2 = new ConcreteCompany("李俊波武汉分公司");
        root.add(comp1);
        root.add(comp2);
        comp1.add(new HRDepartment("上海人力资源部"));
        comp1.add(new FinanceDepartment("上海财务部"));
        comp2.add(new HRDepartment("武汉人力资源部"));
        comp2.add(new FinanceDepartment("武汉财务部"));
        root.display(1);
        root.lineOfDuty();
    }
}
