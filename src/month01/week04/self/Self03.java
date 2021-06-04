package month01.week04.self;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Self03 {

    public static void main(String[] args) {
        MyArrayList my = new MyArrayList();
        my.add("String");
        my.add("Integer");
        my.add(null);
        my.add("Sql");
        my.add("HTML5");
        my.add(null);
        System.out.println(my);
    }
    @Test
    public void test01() {
        List<String> list = new ArrayList();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);
    }
}
