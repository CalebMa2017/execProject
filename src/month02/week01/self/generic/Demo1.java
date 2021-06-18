package month02.week01.self.generic;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.junit.Test;
import sun.rmi.runtime.Log;

/**
 * 泛型
 */
public class Demo1 {

    public static void main(String[] args) {
        GenericClass gc = new GenericClass(33);
        Object method = gc.method();
        System.out.println(method);
    }
    @Test
    public void test1() {
        GenericClass g = new GenericClass();
        String s = "MaChen";
        String s1 = g.method2(s);
        System.out.println(s1);
    }
    @Test
    public void test2() {
        String china = GenericClass.method4("China");
        System.out.println(china);
    }
    @Test
    public void test3() {
//        InheritClass.method();
        System.out.println("----------------");
        InheritClass ic = new InheritClass();
//        ic.method2();
    }
    @Test
    public void test4() {

    }

}

/**
 * 泛型的第一个类
 */
class GenericClass{
    public GenericClass() {

    }

    public GenericClass(int age) {
        this.age = age;
    }

    private int age;
    public <T> T method() {
        return (T)new Integer(age);
    }

    public <T> T method2(T t) {
        System.out.println(t);
        return t;
    }
    public <K,T> K method3(T t) {
        return (K)t;
    }
    public static <T> T method4(T t) {
        return (T)null;
    }

}
class GenericClass2<T>{
    private T t;
    public  static <T> T method() {
        return (T)null;
    }
    public static <T> void method2(T t) {
        System.out.println(t);
        return;
    }
    public T method3() {
        return t;
    }
}
class InheritClass extends GenericClass2{

}