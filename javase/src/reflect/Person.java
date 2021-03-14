package reflect;

public class Person {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //吃食物的方法
    public void eat(){
        System.out.println("吃食物");
    }

    //喝水的方法
    public void drink(){
        System.out.println("喝水");
    }

}
