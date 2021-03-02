package 责任链模式;

abstract class Manager {
    protected String name;
    //管理者的上级
    protected Manager superior;

    public Manager getSuperior() {
        return superior;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public Manager(String name) {
        this.name = name;
    }

    //处理请求
    public abstract  void requestDo(MyRequest request);
}
