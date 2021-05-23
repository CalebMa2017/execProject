package morth01.week02;

import org.junit.Test;

public class CourseTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat("骨头");
    }
    @Test
    public void testFn() {
        String str = null;
        try {
            System.out.println(str.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        A1 a1 = null;
        System.out.println(a1.toString());
    }

    /**
     * 测试类型转换
     */
    @Test
    public void test01() {
        int a=3;
        float b=a;
        double c=a;
        System.out.println(b);
        System.out.println(c);
        long d= (long) b;
        System.out.println(d);
        b=d;
        c=d;
    }
    @Test
    public void test02() {
        Horse horse = new Horse();
        Hores2 hores2 = new Hores2();

    }
}
class Animal1 {
    int age;
}
class Horse extends Animal1 {

}
class Hores2 extends Animal1 {

}
class A1 {
    static final int a ;
    A1() {

    }
    {

    }
    static {
        a=3;
    }
}
class Animal {
    public void eat() {
        System.out.println("Animal.eat.emit");
    }
    public void eat(String food) {
        System.out.println("eat"+food);
    }
}
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("eat1");
    }
}
