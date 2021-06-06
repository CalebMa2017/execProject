package month01.week04.selfClass.iteratorModel;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E>{
    private int capacity;
    private Object[] elements;
    private int size;
    @Override
    public int size() {
        return size;
    }

    public MyArrayList() {
        elements = new Object[]{};
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean add(E e) {
        if(capacity==0) {
            capacity=10;
            elements = new Object[10];
        }else {
            elements = Arrays.copyOf(elements,elements.length*3/2);
        }
        return true;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public MyIterator<E> iterator() {
        return new MyArrayListIterator<E>(this);
    }
}
