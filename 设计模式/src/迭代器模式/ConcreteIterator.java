package 迭代器模式;

import java.util.ArrayList;

public class ConcreteIterator extends MyIterator {

    private ArrayList list;
    private int current = 0;

    public ConcreteIterator(ArrayList list) {
        this.list = list;
    }


    @Override
    public void next() {

        current++;

    }

    @Override
    public boolean isDone() {
        return current >= list.size() ? true : false;
    }

    @Override
    public Object current() {
        return list.get(current);
    }
}
