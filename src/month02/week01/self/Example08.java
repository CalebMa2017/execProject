package month02.week01.self;

import java.lang.reflect.Method;

/**
 * Class类练习
 */
public class Example08 {
    public static void main(String[] args) {
        Class<Pig> pigClass = Pig.class;
        Method[] methods = pigClass.getMethods();
        /*
        只显示public的方法，且不显示构造方法
         */
        for(Method m : methods) {
            System.out.println(m);
        }
    }
}
class Pig{
    private int age;
    private int name;
    public Pig(){

    }
    public Pig(int age) {
        this.age=age;
    }
    public Pig(int age,int name) {
        this.age=age;
        this.name=name;
    }
    public void shout() {
        System.out.println("叫");
    }
    public void eat(String foodname) {
        System.out.println("eat"+foodname);
    }
    private void method() {
        System.out.println("hhhhhh");
    }

    @Override
    public String toString() {
        return "Pig{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}
