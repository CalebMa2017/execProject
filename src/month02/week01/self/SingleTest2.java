package month02.week01.self;

import org.junit.Test;
import sun.security.mscapi.CPublicKey;

/**
 * 单例设计模式的默写
 */
public class SingleTest2 {
    public static void main(String[] args) {

    }
    @Test
    public void testFn() {
        System.out.println("这是一条输出语句");

    }
    @Test
    public void testFn2() {
        System.out.println("这是一条输出语句");
    }
}
final class Singleton {
    private Singleton() {
        throw new RuntimeException("构造方法已经被封装，不能被外界调用");
    }

        private static Singleton singleton = null;
        public static Singleton getSingleton() {
            if (null == singleton) {
                synchronized (Singleton.class) {
                    if (null == singleton) {
                        singleton = new Singleton();
                    }
                }
        }
        return singleton;
    }
}