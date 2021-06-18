package month02.week01.self.generic;

import org.junit.Test;

import java.io.Serializable;

/**
 * 泛型的应用
 */
public class Demo2 {

    public static void main(String[] args) {
        System.out.println();
    }
    class Generic<T>{
        /**
         * 泛型方法中允许使用
         * @param t
         * @param <E>
         * @return
         */
        public <E> E method1(T t) {
            System.out.println(t);
            return null;
        }

    }
    public <T> T returnValue(T... args) {
        return args[0];
    }
    @Test
    public void test1() {
        Serializable s = returnValue("3333",111,"33");
        System.out.println(s);
        System.out.println(s.getClass());
    }
}