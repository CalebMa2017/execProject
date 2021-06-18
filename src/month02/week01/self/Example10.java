package month02.week01.self;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * 所有的构造器
 */
public class Example10 {
    public static void main(String[] args) {
        Class<Pig> pigClass = Pig.class;
        Constructor<?>[] constructors = pigClass.getConstructors();
        for(Constructor c:constructors) {
            System.out.println(c);
            System.out.println(c.getClass()+" -> "+c.getName()+" -> "+ Modifier.toString(c.getModifiers())+" -> "+c.getParameterCount());
            System.out.println("-----------------------");
        }
    }
}
