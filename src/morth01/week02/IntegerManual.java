package morth01.week02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 自己不太懂的“错误”  我没找到程序的逻辑错误
 */
public class IntegerManual {
    public static void main(String[] args) {
        MyInteger m1 = MyInteger.valueOf(10);
        MyInteger m2 = MyInteger.valueOf(10);
        System.out.println(m1==m2);
    }
}
class MyInteger{
    private int value;
    private static final int  MAX=127;
    private static final int MIN = -128;
    private MyInteger(int a) {
        value= a;
    }
    static {
        for (int i = MyInteger.MIN; i <=MyInteger.MAX; i++) {
            MyInteger.cache[i-MyInteger.MIN] = new MyInteger(i);
        }
    }
    private static MyInteger[] cache = new MyInteger[256];
    public static MyInteger valueOf(int a) {
        if(a>=MIN&&a<=MAX) {
            return cache[a-(MIN)];
        }else {
            return new MyInteger(a);
        }
    }
    public int intValue(MyInteger m) {
        return m.value;
    }
}
