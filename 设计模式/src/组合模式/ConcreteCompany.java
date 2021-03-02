package 组合模式;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<Company>();

     public ConcreteCompany(String name) {
         super(name);
     }

     @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println("级别:"+depth+" 名称:"+name);
        for (Company child : children) {
            child.display(depth+1);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company child : children) {
            child.lineOfDuty();
        }
    }
}
