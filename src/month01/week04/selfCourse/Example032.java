package month01.week04.selfCourse;

import java.util.Random;

/**
 * Math,Random续
 */
public class Example032 {

    public static void main(String[] args) {
        double sqrt = Math.sqrt(5);
        System.out.println(sqrt);
        double ceil = Math.ceil(Math.PI);
        System.out.println(ceil);
        double floor = Math.floor(3);
        System.out.println(floor);
        System.out.println("----------------测试Random---------------");
        Random r = new Random();
        //有可能是负数
        System.out.println(r.nextInt());
        System.out.println(r.nextBoolean());
        System.out.println(r.nextInt(100));
    }
}
