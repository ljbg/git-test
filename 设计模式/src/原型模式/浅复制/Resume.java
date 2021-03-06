package 原型模式.浅复制;

public class Resume implements Cloneable {
    private  String name;
    private String sex;
    private  String age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work  = new WorkExperience();
    }

    public void setSexAge(String sex,String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate,String company) {
        this.work.setWorkDate(workDate);
        this.work.setCompany(company);
    }

    public void display(){
        System.out.println("姓名:"+name+"年龄:"+age+"性别:"+sex+"工作经历:"+work.getWorkDate()+" "+work.getCompany());
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
