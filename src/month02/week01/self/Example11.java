package month02.week01.self;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射的使用
 */
public class Example11 {
    public static void main(String[] args) {
        Pig p = new Pig();
        Class<Pig> pigClass = Pig.class;
        Method[] methods = pigClass.getMethods();
        for(Method m:methods) {
            if(m.getName().equals("toString")){
                Object invoke = null;
                try {
                    invoke = m.invoke(p);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                System.out.println(invoke);
            }
        }
        System.out.println("----------------");
        for(Method m:methods) {
            if("method".equals(m.getName())) {
                m.setAccessible(true);
                try {
                    m.invoke(p);//为什么会调不到？
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
