package 模板模式;

//算法骨架
abstract class Struct {
    public abstract void operationA();
    public abstract void operationB();


    public void method(){
        operationA();
        operationB();
        System.out.println("");
    }
}
