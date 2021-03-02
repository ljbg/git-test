package 迭代器模式;

abstract class MyIterator {

    public abstract void  next();    //指向下一个对象

    public abstract boolean isDone();  //判断是否结尾

    public abstract Object current();  //得到当前对象

}