package month01.week04.selfClass;

import java.util.*;

public class Pig implements Cloneable{
    private String name;
    private int age;
    private int weight;



    @Override
    protected Pig clone() throws CloneNotSupportedException {
        return (Pig) super.clone();
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Pig() {
    }

    public Pig(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
class PigComparator implements Comparator<Pig> {
    @Override
    public int compare(Pig o1, Pig o2) {
        return o1.getAge()-o2.getAge();
    }
}
class PigFactory {
    /**
     * 传入各种属性，生产指定个数的猪，
     * 返回由多个这种猪组成的集合
     * @param name
     * @param age
     * @param weight
     * @param num
     * @return
     */
    public static Collection<Pig> producePigs(String name, int age, int weight,int num) {
        Collection<Pig> result = new ArrayList<>();
        Pig sour = producePig(name,age,weight);
        result.add(sour);
        for (int i = 1; i < num; i++) {
            try {
                Pig clone = sour.clone();
                result.add(clone);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    public static Pig producePig(String name,int age,int weight) {
        return new Pig(name,age,weight);
    }
}