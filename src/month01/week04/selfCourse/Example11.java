package month01.week04.selfCourse;

/**
 * Lambda表达式
 * lambda不能传常量，它只是用来实现抽象方法的
 */
public class Example11 {

    public static void main(String[] args) {
        LamInter li = () -> System.out.println("无参数");
        Dog d = System.out::println;
        li.method();
        d.eat("骨头");
        Cat c = str -> str;
        System.out.println(c.eat("鱼"));
        //lambda 中 final的使用
        Cat cat = (final String foodname )-> foodname;
        String namefood = "鱼肉";
        String fish = cat.eat(namefood);
        System.out.println(fish);
    }

}

/**
 * 有参数，有返回值的函数式接口
 */
@FunctionalInterface
interface Cat {
    String eat(String foodname);
}

/**
 * 定义函数式接口
 */
@FunctionalInterface
interface LamInter {
    void method();
}

/**
 * 定义带一个参数的函数式接口
 */
@FunctionalInterface
interface Dog {
    void eat(String foodname);
}

