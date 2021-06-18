package month02.week01.self.collectionTest;

import java.util.*;

/**
 * 集合的比较
 */
public class Example1 {

    public static void main(String[] args) {
        TreeSet tset = new TreeSet();
        tset.add("hhhhhhh");
        tset.add("222222");
        tset.add("1111111111111");
        tset.add("xxxx");
        tset.add("aaa");
        System.out.println(tset);
//        Collections.sort(tset,new MyComparator());
        System.out.println(tset);
    }
}
/**
 * 自定义比较器
 */
class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((String)o1).length()-((String)o2).length();
    }
}
