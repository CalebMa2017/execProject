package month01.week04.self;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * 自我练习02
 */
public class Self02 {

    public static void main(String[] args) {
        double d =3.333;
        System.out.println(SelfTool.round02(d));
        System.out.println(SelfTool.roundInt(d));
        System.out.println(SelfTool.round03(d));
    }
    @Test
    public void test01() {
        BigDecimal d = new BigDecimal(22222.222);
        BigDecimal bg1 = BigDecimal.valueOf(33);
//        System.out.println(bg1);
//        System.out.println(d);
        System.out.println(SelfTool.round04(d));
        System.out.println(SelfTool.round05(d));
        System.out.println(SelfTool.round05(new BigDecimal("33333.3333333333333")));
    }

    /**
     * 练习2：MD5
     */
    @Test
    public void test02() {
        String str = "tiewophqfewiop89450373-4=32-4=3-";
        System.out.println(SelfTool.md5calculate(str));
        String st2 = "39";
        System.out.println(SelfTool.md5calculate(st2));
    }

    /**
     * 练习3
     */
    @Test
    public void test03() {

    }
}
/**
 * 我的list集合
 */
class MyArrayList {
    private Object[] capacity;
    private int size;
    public void printLenOfArr() {
        System.out.println("内部数组的长度是"+capacity.length);
    }
    /**
     * 无参构造方法调用有参构造方法
     */
    public MyArrayList() {
        this(0);
    }

    /**
     * 有参构造方法
     * @param firstcap
     */
    public MyArrayList(int firstcap){
        capacity = new Object[firstcap];
    }

    /**
     * 添加方法
     * @param o
     */
    public void add(Object o){
        if(size==capacity.length)
            copyOfArr();
        capacity[size++] = o;
    }

    /**
     * 数组扩容
     */
    private void copyOfArr() {
        int len = capacity.length;
        if(size==0)
            capacity = Arrays.copyOf(capacity,10);
        else
            capacity = Arrays.copyOf(capacity,len+len/2);
    }

    /**
     * 在指定索引位置添加元素
     * @param index
     * @param o
     */
    public void add(int index,Object o) {
        if(size++==capacity.length) copyOfArr();
        for(int i= capacity.length;i>index;i++) {
            capacity[i] = capacity[i-1];
        }
        capacity[index]=o;
    }


    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(capacity,size));
    }
}