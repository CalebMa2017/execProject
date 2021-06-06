package month01.week04.selfCourse;

import java.util.ArrayList;
import java.util.List;

/**
 * List练习
 */
public class Example13 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("String01");
        li.add("MaChen");
        li.add("Girlfriend");
        li.add("Forever");
        li.add("I love you");
        System.out.println(li);

        li.add(2,"indexInsert");
        for(String str:li) {
            System.out.print(str+" ");
        }
        //<Object>泛型  PECS   super返回的必定是Object
        List<? super Object> li2 = new ArrayList();//无意义 ：和<Object>相同
        li2.add(new Integer(1));
        //<? extends Fruit>应用
        List<? super Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit());
        fruits.add(new Apple());
//        fruits.add(new Object()); Exception
        Object object = fruits.get(0);
        //返回值不同
        List<Fruit> fruits1 = new ArrayList<>();

        Fruit fruit = fruits1.get(0);

    }
}
class Fruit{}
class Apple extends Fruit{}
class RedApple extends Apple{}
class Banana extends Fruit{}
