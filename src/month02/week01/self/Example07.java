package month02.week01.self;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射相关
 */
public class Example07 {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        Class<? extends TestClass> aClass = tc.getClass();
        System.out.println(aClass);
        Package aPackage = aClass.getPackage();
        System.out.println(aPackage);
        System.out.println(aPackage.getName());
        TestClass testClass = null;
        try {
            testClass = aClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(testClass);
        Constructor<? extends TestClass> constructor = null;
        try {
            constructor = aClass.getConstructor(String.class, int.class, int.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        TestClass hhh = null;
        try {
            hhh = constructor.newInstance("hhh", 8, 9);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(hhh);
    }
}
