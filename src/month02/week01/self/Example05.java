package month02.week01.self;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Class类
 */
public class Example05 {
    public static void main(String[] args) {
        Dog d = new Dog();
        /*
        获取Class类
         */
        //方式1:对象getClass
        Class<? extends Dog> dClass = d.getClass();
        System.out.println(dClass);
        String s = dClass.toString();
        System.out.println(s);
        //方式2:类名.class
        Class<Dog> dogClass = Dog.class;
        System.out.println(dogClass);
        System.out.println(dogClass.toString());
        //方式3:Class.forName
        Class aClass=null;
        try {
             aClass = Class.forName("month02.week01.self.Dog");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(aClass);
        /**
         * 通过Class类对象 -> 该类的对象
         */
        System.out.println("         * 通过Class类对象 -> 该类的对象\n");
        try {
            Object o = aClass.newInstance();
            System.out.println(o);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("print c");
        Constructor[] constructors = aClass.getConstructors();
        for (Constructor c :constructors) {
            System.out.println(c);
        }

        System.out.println("打印constructor--------------------");
        try {
            Constructor constructor = aClass.getConstructor();
            Object o = constructor.newInstance();
            System.out.println(o);
            System.out.println(constructor.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("__________");
        Dog doghua = null;
        try {
            doghua = Dog.class.getConstructor(String.class,int.class).newInstance("花花",5);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(doghua);
    }

}
class Dog {
    private String name;
    private int age;
    public void shout() {
        System.out.println("Dog.shout");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
