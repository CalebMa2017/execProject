package month01.week03;

import java.util.Arrays;
import java.util.Set;

/**
 * 链表实现
 */
public class ArrayListDemo {

    public static void main(String[] args) {
//        Set
    }
}

class MyArrayList {
    private Object[] arr;
    private int size;
    public int size() {
        return this.size;
    }
    public MyArrayList(int capacity){
        arr = new Object[capacity];
        size=capacity;
    }

    public MyArrayList() {
        this(0);
    }

    /**
     * 添加
     * @param o
     */
    public void add(Object o) {
        if (size==0) {
            arrCopyOf();
        }
        arr[size++] = o;
    }

    /**
     * 扩容
     */
    private void arrCopyOf() {
        if(size==0) {
            arr = new Object[10];
            size=10;
        }else {
            size=size+size>>1;
            arr = Arrays.copyOf(arr,size);
        }
    }


}
