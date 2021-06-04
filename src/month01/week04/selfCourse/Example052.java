package month01.week04.selfCourse;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 比较器对象应用实例2
 */
public class Example052 {

    public static void main(String[] args) {
        Animal[] am = new Animal[] {
                new Animal("猴子",7,"brown"),
                new Animal("斑马",12,"black and white"),
                new Animal("松鼠",7,"brown"),
                new Animal("Cat",8,"gold")
        };
        System.out.println(Arrays.toString(am));
        Arrays.sort(am,new AnComparator());
        System.out.println(Arrays.toString(am));
    }
}
/**
 * 动物的专属比较器对象
 */
class AnComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)o1).getAge()-((Animal)o2).getAge();
    }
}

/**
 * Animal类
 */
class Animal implements Cloneable{
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Animal() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String name;
    private int age;
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
