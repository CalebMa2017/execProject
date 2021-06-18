package month02.week01.self;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Class类的属性
 */
public class Example06 {
    public static void main(String[] args) {
        Class<TestClass> tc = TestClass.class;
        System.out.println(tc.getName());
        Package aPackage = tc.getPackage();
        System.out.println(aPackage);
        System.out.println("取得一个类中的全部方法,不包含构造方法");
        Method[] methods = tc.getMethods();
        for(Method m : methods) {
            System.out.println(m);
            String s = Modifier.toString(m.getModifiers());
            System.out.println(s);
        }
        System.out.println("还原修饰符");
        int modifiers = tc.getModifiers();
        System.out.println(modifiers);
        System.out.println(Modifier.toString(tc.getModifiers()));
        Field[] fields = tc.getFields();
        System.out.println(fields);
        for(Field f : fields) {
            System.out.println(f);
        }


    }
}
class TestClass {
    private String name;
    private int id;
    public int num;
    public void methodPub() {
        System.out.println("TestClass.methodPub");
    }
    private void methodPri() {
        System.out.println("TestClass.methodPri");
    }

    public TestClass() {
    }
    public TestClass(String name, int id, int num) {
        this.name = name;
        this.id = id;
        this.num = num;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", num=" + num +
                '}';
    }
}
