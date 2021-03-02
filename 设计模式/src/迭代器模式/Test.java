package 迭代器模式;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("李俊波");
        list.add("郝英");
        list.add("小明");
        list.add("李红");
        list.add("小丽");
        ConcreteIterator iterator = new ConcreteIterator(list);
        while (! iterator.isDone()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
