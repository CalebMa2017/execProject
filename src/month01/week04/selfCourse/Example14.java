package month01.week04.selfCourse;

import org.junit.Test;

import java.util.*;

/**
 * List接口
 */
public class Example14 {

    public static void main(String[] args) {
        List<String> strLi = new ArrayList<>(10);
        strLi.add("hhhh");
        strLi.add("MaChen");
        strLi.add(0,"Technology");
        System.out.println(strLi);
//        strLi.remove(7);
//        System.out.println(strLi);
        strLi.remove(0);
        System.out.println(strLi);
        /*
        Collection不被支持索引
         */
        /*
        List支持索引
         */
        LinkedList<String> strLink = new LinkedList<>();
        strLink.addFirst("hhhhhh");
        System.out.println(strLink);
        strLink.add("222222");
        strLink.add("3333");
        System.out.println(strLink);
    }

    /**
     * Set的去重
     */
    @Test
    public void test01() {
        Set<String> strings = new TreeSet<>();
        String str2 = new String("22222");
        String str1 = "22222";
        System.out.println(str1==str2);
        strings.add("diooeuei");
        strings.add(str1);
        strings.add("33");
        strings.add(str2);
        System.out.println(strings);
    }

    /**
     * HashSet和TreeSet去重
     */
    @Test
    public void test02() {
        /*
        TreeSet比较是否是重复元素比较的是CompareTo方法的返回值
        TreeSet存入的对象必须实现Comparable接口重写CompareTo方法
         */
        Set<AA> set = new TreeSet<>();
        set.add(new AA(18,"MaChen",01));
        set.add(new AA(18,"MaChen",01));
        set.add(new AA(18,"MaChen",01));
        set.add(new AA(19,"MaChen2",01));
        set.add(new AA(19,"MaChen2",01));
        set.add(new AA(19,"MaChen2",01));
        System.out.println(set);
        /*
         HashSet去重比较的是hashcode()和equals（)方法
         必须全部相等才算相等
         */
        Set<AA> set1 = new HashSet<>();
        set1.add(new AA(18,"MaChen",01));
        set1.add(new AA(18,"MaChen",01));
        set1.add(new AA(18,"MaChen",01));
        set1.add(new AA(18,"MaChen",01));
        System.out.println(set1);

        //两者相同的是：重复元素都不会被加入
    }
}
class AA implements Comparable<AA>{
    private int age;
    private String name;
    private int id;

    public AA() {
    }

    public AA(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(AA o) {
        return this.id-o.id;
    }

    @Override
    public String toString() {
        return "AA{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
