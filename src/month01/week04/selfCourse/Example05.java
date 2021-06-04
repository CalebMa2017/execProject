package month01.week04.selfCourse;

import java.util.Arrays;

/**
 * 比较器对象的应用实例
 */
public class Example05 {

    public static void main(String[] args) {
        Person[] ps = new Person[] {
                new Person("马琛",19,"男"),
                new Person("刘蕊",17,"女"),
                new Person("张若词",18,"女"),
                new Person("徐长春",19,"男")
        };
        System.out.println(Arrays.toString(ps));
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}
class Person implements Comparable{
    @Override
    public int compareTo(Object o) {
        return this.age-((Person)o).age;
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
    }

    private String name;
    private int age;
    private String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
