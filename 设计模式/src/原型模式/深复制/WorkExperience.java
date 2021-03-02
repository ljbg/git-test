package 原型模式.深复制;

public class WorkExperience implements Cloneable {
    private String WorkDate;
    private String company;

    public String getWorkDate() {
        return WorkDate;
    }

    public void setWorkDate(String workDate) {
        WorkDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
