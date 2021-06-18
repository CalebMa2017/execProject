package month02.week01.self;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 反射相关
 */
public class Example9 {
    public static void main(String[] args) {
        Pig p = new Pig();
        Class<Pig> pigClass = Pig.class;
        Class<? extends Pig> aClass = p.getClass();
//        System.out.println(pigClass==aClass);
        Method[] methods = pigClass.getMethods();
        for(Method m:methods) {
            System.out.println(m.getName());
        }
        System.out.println("-----------------------------");
        //只能获取本类的方法  不能获取父类的方法 且不能获取构造器
        Method[] declaredMethods = pigClass.getDeclaredMethods();
        for(Method m:declaredMethods) {
            System.out.println(m.getName());
        }
        System.out.println("-----------------------------");


    }
}
